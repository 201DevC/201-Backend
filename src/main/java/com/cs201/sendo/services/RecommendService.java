package com.cs201.sendo.services;

import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.mappers.UserViewCountMapper;
import com.cs201.sendo.mappers.ViewHistoryMapper;
import com.cs201.sendo.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<Product> productByIds = productRepository.getProductByIds(productIds);

        return productByIds;

    }

    public List<Long> getListCategoryLv2(Long userId) {
        return this.userViewsCountMapper.getListMostInteractiveCategory(userId);
    }
}
