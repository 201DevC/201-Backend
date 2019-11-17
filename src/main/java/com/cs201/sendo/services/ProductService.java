package com.cs201.sendo.services;

import com.cs201.sendo.clients.SendoProductClient;
import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.ProductData;
import com.cs201.sendo.models.paging.Paging;
import com.cs201.sendo.models.paging.PagingParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SendoProductClient productClient;

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

    public List<ProductData> getListRelatedProducts(Long productId) {
        try {
            List<Product> listRelatedProduct = productRepository.getListRelatedProduct(productId);

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

    private List<ProductData> getProductData(List<Product> products) {
        List<Long> ids = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setOrder(i);
            ids.add(products.get(i).getProductId());
        }
        List<ProductData> productDataByIds = productRepository.getProductDataByIds(ids);
        List<Product> missingProduct = products.stream().filter(product ->
                productDataByIds.stream().noneMatch(productData -> productData.getId().equals(product.getProductId())))
                .collect(Collectors.toList());
        List<ProductData> listProductData = productClient.getListProductData(missingProduct);

        listProductData.addAll(productDataByIds);
        return listProductData;
    }
}


