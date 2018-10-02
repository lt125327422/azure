package com.azure.c.azure.vo;

import lombok.Data;

/**
 * @Author chino_cocoa
 * @Description
 * @Date 12:29 2018/10/2
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;


}
