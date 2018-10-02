package com.azure.c.azure.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @Author chino_cocoa
 * @Description
 * @Date 19:44 2018/10/2
 */
@Getter
public enum ResultEnum {

    SUCCESS(0, "成功"),

    PARAM_ERROR(1, "参数不正确"),

    ACCOUNT_HAS_EXIST(2,"账号已存在");


    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
