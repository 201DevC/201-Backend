package com.cs201.sendo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private Long id;
    private String name;
    private Long parentId;
}
