package com.cs201.sendo.models;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
    private String sendoUserId;
}
