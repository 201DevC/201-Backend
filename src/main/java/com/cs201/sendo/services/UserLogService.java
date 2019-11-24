package com.cs201.sendo.services;

import com.cs201.sendo.mappers.UserLogMapper;
import org.springframework.stereotype.Service;

@Service
public class UserLogService {

    private final UserLogMapper userLogMapper;

    public UserLogService(UserLogMapper userLogMapper) {
        this.userLogMapper = userLogMapper;
    }
}
