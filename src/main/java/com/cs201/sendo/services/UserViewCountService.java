package com.cs201.sendo.services;

import com.cs201.sendo.mappers.ProductRepository;
import com.cs201.sendo.mappers.UserViewCountMapper;
import com.cs201.sendo.models.Product;
import com.cs201.sendo.models.UserViewCount;
import com.cs201.sendo.models.ViewHistory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserViewCountService {

    private final UserViewCountMapper userViewCountMapper;
    private final ProductRepository productRepository;

    public UserViewCountService(UserViewCountMapper userViewCountMapper, ProductRepository productRepository) {
        this.userViewCountMapper = userViewCountMapper;
        this.productRepository = productRepository;
    }

    public void insertFavoriteCategoryLv2(Long id, List<Long> favLv2Ids) {

        List<UserViewCount> userViewCounts = new ArrayList<>();
        for (Long cateLv2 : favLv2Ids) {
            UserViewCount userViewCount = new UserViewCount();
            userViewCount.setCateLv2Id(cateLv2);
            userViewCount.setUserId(id);
            userViewCount.setCount(100);

            userViewCounts.add(userViewCount);
        }

        for (UserViewCount viewCount : userViewCounts) {
            this.updateViewCount(viewCount);
        }
    }

    public void insertViewCountRecord(ViewHistory viewHistory) {
        UserViewCount userViewCount = new UserViewCount();
        userViewCount.setCateLv2Id(viewHistory.getCatLv2Id());
        userViewCount.setUserId(viewHistory.getUserId());
        userViewCount.setCount(1);
        this.updateViewCount(userViewCount);

    }

    private void updateViewCount(UserViewCount userViewCount) {
        UserViewCount viewCount = userViewCountMapper.getViewCountRecord(userViewCount);

        if (viewCount != null) {
            userViewCountMapper.updateUserViewCount(userViewCount);
        } else {
            userViewCountMapper.insertUserViewCount(userViewCount);
        }
    }

    public void deleteUserViewCount(Long userId, Long productId) {

        Product product = productRepository.getProductById(productId);

        UserViewCount userViewCount = new UserViewCount();
        userViewCount.setCateLv2Id(product.getCatLv2Id());
        userViewCount.setUserId(userId);
        userViewCount.setCount(0);

        userViewCountMapper.hardUpdateUserViewCount(userViewCount);

    }
}
