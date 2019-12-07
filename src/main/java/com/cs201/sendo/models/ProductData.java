package com.cs201.sendo.models;

import com.cs201.sendo.clients.pojos.RatingInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductData {

    public ProductData(Long id) {
        this.id = id;
    }

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
    @JsonProperty(value = "price_max")
    private Integer priceMax;
    @JsonIgnore
    private int order;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("description")
    private String description;

}
