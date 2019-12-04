package com.cs201.sendo.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Product {
    private Long productId;
    @EqualsAndHashCode.Exclude
    private Long sdProductId;
    @EqualsAndHashCode.Exclude
    private Long catLv1Id;
    @EqualsAndHashCode.Exclude
    private Long catLv2Id;
    @EqualsAndHashCode.Exclude
    private Long catLv3Id;
    @EqualsAndHashCode.Exclude
    private String pathName;
    @EqualsAndHashCode.Exclude
    private String alterHref;
    @EqualsAndHashCode.Exclude
    private int order;
}
