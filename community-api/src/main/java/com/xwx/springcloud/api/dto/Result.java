package com.xwx.springcloud.api.dto;

import com.xwx.springcloud.api.enums.ResultCommonEnum;
import io.swagger.annotations.ApiModel;

/**
 * @author winsonxiao
 * @ClassName Result
 * @date 2021/9/29、11:18 上午
 */

@ApiModel(
        description = "返回result"
)
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return this.code.equals(ResultCommonEnum.SUCCESS.getCode());
    }

    public boolean isNotSuccess() {
        return !this.isSuccess();
    }

    public void buildSuccess() {
        this.setCode(ResultCommonEnum.SUCCESS.getCode());
        this.setMsg(ResultCommonEnum.SUCCESS.getMsg());
    }

    public void buildSuccess(T data) {
        this.setData(data);
        this.setCode(ResultCommonEnum.SUCCESS.getCode());
        this.setMsg(ResultCommonEnum.SUCCESS.getMsg());
    }

    public void buildFail() {
        this.setCode(ResultCommonEnum.UNKNOWN_ERROR.getCode());
        this.setMsg(ResultCommonEnum.UNKNOWN_ERROR.getMsg());
    }

    public static Result<NoBody> buildSucessNoBody() {
        Result<NoBody> bodyResult = new Result();
        bodyResult.setCode(ResultCommonEnum.SUCCESS.getCode());
        bodyResult.setMsg(ResultCommonEnum.SUCCESS.getMsg());
        bodyResult.setData(new NoBody());
        return bodyResult;
    }

    public static <T> Result<T> buildSucess(T data) {
        Result<T> bodyResult = new Result();
        bodyResult.setCode(ResultCommonEnum.SUCCESS.getCode());
        bodyResult.setMsg(ResultCommonEnum.SUCCESS.getMsg());
        bodyResult.setData(data);
        return bodyResult;
    }

    public static <T> Result<T> buildFail(Integer code, String msg) {
        Result<T> bodyResult = new Result();
        bodyResult.setCode(code);
        bodyResult.setMsg(msg);
        return bodyResult;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "Result{ code=" + this.code + ", msg='" + this.msg + '\'' + ", data=" + this.data + '}';
    }
}
