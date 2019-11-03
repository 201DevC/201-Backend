package com.cs201.sendo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@ApiModel
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    @ApiModelProperty(value = "Dinh dang: 18-11-1996")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;
    private Boolean gender;
    private String password;
    @ApiModelProperty(value = "Thuoc tinh unique")
    private String username;
    private Boolean survey;
}
