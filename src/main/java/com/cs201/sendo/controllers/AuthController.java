package com.cs201.sendo.controllers;

import com.cs201.sendo.models.LoginRequest;
import com.cs201.sendo.models.UserModel;
import com.cs201.sendo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public UserModel login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }
}
