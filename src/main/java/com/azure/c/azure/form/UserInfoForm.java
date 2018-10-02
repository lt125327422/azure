package com.azure.c.azure.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @Author chino_cocoa
 * @Description
 * @Date 18:59 2018/10/2
 */
@Data
public class UserInfoForm {

    private String id;

    @NotEmpty(message = "用户名必填")
    private String userName;

    @NotEmpty(message = "账号必填")
    private String account;

    @NotEmpty(message = "密码必填")
    private String password;

    private String picture;

    private String email;

    private String phone;

    private Integer gender;

    private Date createTime;

    private Date updateTime;
}
