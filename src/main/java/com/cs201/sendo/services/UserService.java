package com.cs201.sendo.services;

import com.cs201.sendo.mappers.UserRepository;
import com.cs201.sendo.models.LoginRequest;
import com.cs201.sendo.models.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createUser(UserModel userModel) {
        try {
            UserModel user = userRepository.getUserByUsername(userModel.getUsername());
            if (user != null) {
                return user;
            }
            userRepository.createUser(userModel);
            return userRepository.getUserById(userModel.getId());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public UserModel login(LoginRequest loginRequest) {
        try {
            return userRepository.getUserByLoginRequest(loginRequest);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
