package com.cs201.sendo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductData {
    private Long id;
    private String name;
    private List<String> images;
    @JsonProperty(value = "order_count")
    private Integer orderCount;
    @JsonProperty(value = "shop_info")
    private ShopInfo shopInfo;
    private Integer price;
}
