package com.azure.c.azure.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author chino_cocoa
 * @Description
 * @Date 15:05 2018/10/2
 */
@Data
public class UserInfoVO {

    @JsonProperty("userId")
    private String id;

    private String userName;

    private String account;

//    @JsonIgnore
//    private String password;

    private String picture;

    private String email;

    private String phone;

    private Integer gender;

    @JsonIgnore
    private Date createTime;

    @JsonIgnore
    private Date updateTime;


}
