package com.cs201.sendo.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ViewHistory {

    private Long userId;
    private Long productId;
    private String productName;
    private Long catLv1Id;
    private Long catLv2Id;
    private Long catLv3Id;
    private String catLv1Name;
    private String catLv2Name;
    private String catLv3Name;
    private String username;
    private String sId;
    private LocalDateTime dateTime;

}
