package com.tghoul.enums;

import lombok.Getter;

/**
 * Created by TGhoul
 * 2017-08-07  16:27
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
