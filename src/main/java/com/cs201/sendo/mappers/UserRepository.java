package com.cs201.sendo.mappers;

import com.cs201.sendo.models.LoginRequest;
import com.cs201.sendo.models.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRepository {

    void createUser(UserModel userModel);

    UserModel getUserById(Long userId);

    UserModel getUserByLoginRequest(LoginRequest loginRequest);
}
