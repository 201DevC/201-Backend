package com.cs201.sendo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cs201.sendo.mappers")
public class SendoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendoApplication.class, args);
    }

}
