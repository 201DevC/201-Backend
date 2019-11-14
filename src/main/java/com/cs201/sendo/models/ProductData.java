package com.cs201.sendo.models;

import com.cs201.sendo.clients.pojos.RatingInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductData {
    private Long id;
    @JsonProperty(value = "sendo_pid")
    private Long sendoPid;
    private String name;
    private List<String> images;
    @JsonProperty(value = "order_count")
    private Integer orderCount;
    @JsonProperty(value = "shop_info")
    private ShopInfo shopInfo;
    @JsonProperty(value = "rating_info")
    private RatingInfo ratingInfo;
    private Integer price;
    @JsonIgnore
    private int order;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("description")
    private String description;

}
