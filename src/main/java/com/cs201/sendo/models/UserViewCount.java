package com.cs201.sendo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserViewCount {
    private Long userId;
    private Long cateLv2Id;
    private Integer count;
    private String sId;

    @Override
    public String toString() {
        return userId +
                "," + cateLv2Id +
                "," + count +
                "," + sId;
    }
}