package com.cs201.sendo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long productId;
    private Long sdProductId;
    private Long catLv1Id;
    private Long catLv2Id;
    private Long catLv3Id;
    private String pathName;
    private String alterHref;
    private int order;
}
