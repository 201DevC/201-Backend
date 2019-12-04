package com.cs201.sendo.services;

import com.cs201.sendo.clients.SendoProductClient;
import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    private final SendoProductClient productClient;

    private final RecommendService recommendService;

    public ProductService(RecommendService recommendService, ProductRepository productRepository, SendoProductClient productClient) {
        this.recommendService = recommendService;
        this.productRepository = productRepository;
        this.productClient = productClient;
    }

//    @Autowired
//    private SendoProductClientV2 productClient;

    public Paging<ProductData> getListProductByCategory(Long cate1, Long cate2, Long cate3, PagingParams pagingParams, String keyword) {
        try {
            Long count = productRepository.getProductCountByCategory(cate1, cate2, cate3, keyword);
            List<Product> products = productRepository.getListProductByCategory(cate1, cate2, cate3, pagingParams, keyword);

            List<ProductData> listProductData = getProductData(products);

            return Paging.of(listProductData, count, pagingParams);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<ProductData> getListRelatedProducts(Long productId, Long userId) {
        try {
            List<Product> listRelatedProduct = new ArrayList<>();
            Product product = productRepository.getProductById(productId);
            if (product != null) {
                try {
                    List<Product> recommendationProduct = recommendService.getRecommendationProduct(userId);
                    for (Product recommend : recommendationProduct) {
                        if (product.getCatLv2Id().equals(recommend.getCatLv2Id()) && !product.getProductId().equals(recommend.getProductId())) {
                            listRelatedProduct.add(recommend);
                        }
                    }
                } catch (Exception e) {
                    log.error("Error when add recommend {}", e.getMessage(), e);
                }
                listRelatedProduct.addAll(productRepository.getListRelatedProduct(product));
            }
            return this.getProductData(listRelatedProduct);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<ProductData> getTrendingProducts() {
        try {
            List<Product> listRelatedProduct = productRepository.getTrendingProducts();

            return this.getProductData(listRelatedProduct);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public ProductData getProductDetail(Long productId) {
        try {
            Product product = productRepository.getProductById(productId);

            return productClient.getProduct(product);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<ProductData> getListProductDataByIds(List<Long> ids) {
        try {
            if (Objects.isNull(ids) || ids.size() <= 0) {
                return new ArrayList<>();
            }
            List<Product> products = productRepository.getProductByIds(ids);

            return this.getProductData(products);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<ProductData> getListSampleProductByCatLv2Ids(List<Long> catLv2Ids) {
        try {
            List<Product> products = productRepository.getSampleProductByCategories(catLv2Ids);

            return this.getProductData(products);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<ProductData> getRecommendationByCategory2(List<Long> categoryIds) {
        try {
            List<Product> products = new ArrayList<>();

            for (Long categoryId : categoryIds) {
                Product productRecommend = productRepository.getRecommendationByCategory2(categoryId);
                products.add(productRecommend);
            }
            List<ProductData> listProductData = getProductData(products);

            return listProductData;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<ProductData> getProductData(List<Product> products) {
        if (products == null || products.size() <= 0) {
            return new ArrayList<>();
        }
        List<Long> ids = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setOrder(i);
            ids.add(products.get(i).getProductId());
        }
        List<ProductData> productDataByIds = productRepository.getProductDataByIds(ids);
//        List<Product> missingProduct = products.stream().filter(product ->
//                productDataByIds.stream().noneMatch(productData -> productData.getId().equals(product.getProductId())))
//                .collect(Collectors.toList());
//
//        List<ProductData> listProductData = new ArrayList<>();
//        try {
//            listProductData = productClient.getListProductData(missingProduct);
//        } catch (Exception e) {
//            log.error("Error {}", e.getMessage() , e);
//        }
//
//        productDataByIds.addAll(listProductData);


        Map<Long, ProductData> productDataMap = productDataByIds.parallelStream().collect(Collectors.toMap(ProductData::getId, productData -> productData));
        List<ProductData> result = new ArrayList<>();

        for (Long id : ids) {
            result.add(productDataMap.get(id));
        }
        return result;
    }

    public List<ProductData> getRecommendationProducts(Long userId) {

        List<Product> result = new ArrayList<>();
        List<Product> recommendationProducts = this.recommendService.getRecommendationProduct(userId);

        List<Long> listRecommendCat = this.recommendService.getListCategoryLv2(userId);

        for (Product recommendationProduct : recommendationProducts) {
            if (listRecommendCat.contains(recommendationProduct.getCatLv2Id())) {
                if (!result.contains(recommendationProduct)) {
                    result.add(recommendationProduct);
                }
            }
        }

        PagingParams params = PagingParams.builder().offset(0L).size(5L).build();
        for (Long aLong : listRecommendCat) {
            List<Product> listProductByCategory = productRepository.getListProductByCategory(null, aLong, null, params, null);
            result.addAll(listProductByCategory);
        }

        return this.getProductData(result);
    }
}


