package com.azure.c.azure.exception;

import com.azure.c.azure.enums.ResultEnum;

/**
 * @Author chino_cocoa
 * @Description
 * @Date 19:41 2018/10/2
 */
public class AzureException extends RuntimeException {

    private Integer code;

    public AzureException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public AzureException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
