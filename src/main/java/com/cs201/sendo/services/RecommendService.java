package com.cs201.sendo.services;

import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.mappers.UserViewCountMapper;
import com.cs201.sendo.mappers.ViewHistoryMapper;
import com.cs201.sendo.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class RecommendService {

    private final ViewHistoryMapper viewHistoryMapper;

    private final ProductRepository productRepository;
    private final UserViewCountMapper userViewsCountMapper;

    public RecommendService(ViewHistoryMapper viewHistoryMapper, ProductRepository productRepository, UserViewCountMapper userViewsCountMapper) {
        this.viewHistoryMapper = viewHistoryMapper;
        this.productRepository = productRepository;
        this.userViewsCountMapper = userViewsCountMapper;
    }

    public List<Product> getRecommendationProduct(Long userId) {

        List<Long> productIds = viewHistoryMapper.getList20ProductIdHistByUser(userId);
        if (productIds.size() <= 0) {
            return new ArrayList<>();
        }
        List<Product> productByIds = productRepository.getProductByIds(productIds);


        List<Product> listProductByCategoryLv3 = this.getListProductByCategoryLv3(productByIds);

        List<Product> products = listProductByCategoryLv3.stream().filter(product -> !productByIds.contains(product)).collect(Collectors.toList());

        return products;
    }

    public List<Long> getListCategoryLv2(Long userId) {
        return this.userViewsCountMapper.getListMostInteractiveCategory(userId);
    }

    private List<Product> getListProductByCategoryLv3(List<Product> productIds) {
        if (productIds == null || productIds.size() == 0) {
            return new ArrayList<>();
        }
        List<Product> result = new ArrayList<>();
        List<Long> list = productIds.stream().filter(Objects::nonNull).map(Product::getCatLv3Id).collect(Collectors.toList());

        for (Long aLong : list) {
            List<Product> products = productRepository.getProductsByCateLv3(aLong);
            result.addAll(products);
        }

        return result;
    }
}
