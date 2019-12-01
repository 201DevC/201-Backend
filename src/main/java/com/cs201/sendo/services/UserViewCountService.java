package com.cs201.sendo.services;

import com.cs201.sendo.mappers.UserViewCountMapper;
import com.cs201.sendo.models.UserViewCount;
import com.cs201.sendo.models.ViewHistory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserViewCountService {

    private final UserViewCountMapper userViewCountMapper;

    public UserViewCountService(UserViewCountMapper userViewCountMapper) {
        this.userViewCountMapper = userViewCountMapper;
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
}
