package com.cs201.sendo.models;

import com.cs201.sendo.clients.pojos.RatingInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ProductData {

    public ProductData(Long id) {
        this.id = id;
    }

    @EqualsAndHashCode.Exclude
    private Long id;
    @EqualsAndHashCode.Exclude
    @JsonProperty(value = "sendo_pid")
    private Long sendoPid;

    private String name;

    @EqualsAndHashCode.Exclude
    private List<String> images;

    @EqualsAndHashCode.Exclude
    @JsonProperty(value = "order_count")
    private Integer orderCount;

    @EqualsAndHashCode.Exclude
    @JsonProperty(value = "shop_info")
    private ShopInfo shopInfo;

    @EqualsAndHashCode.Exclude
    @JsonProperty(value = "rating_info")
    private RatingInfo ratingInfo;

    @EqualsAndHashCode.Exclude
    private Integer price;

    @EqualsAndHashCode.Exclude
    @JsonProperty(value = "price_max")
    private Integer priceMax;

    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private int order;

    @EqualsAndHashCode.Exclude
    @JsonProperty("short_description")
    private String shortDescription;

    @JsonProperty("description")
    @EqualsAndHashCode.Exclude
    private String description;

}
