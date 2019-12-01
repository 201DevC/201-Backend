package com.cs201.sendo.models;

public class UserViewCount implements Serializable {
    @Id
    private Long userId;
    @Id
    @Column(name = "cat_lv2_id")
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