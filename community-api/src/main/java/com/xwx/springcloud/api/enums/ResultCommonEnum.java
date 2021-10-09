package com.xwx.springcloud.api.enums;

/**
 * @author winsonxiao
 * @ClassName ResultCommonEnum
 * @date 2021/9/29、11:19 上午
 */
public enum  ResultCommonEnum {
    UNKNOWN_ERROR(-1, "未知错误"),
    PARAMETER_ERROR(-2, "参数错误"),
    SUCCESS(0, "成功");

    private Integer code;
    private String msg;

    private ResultCommonEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
