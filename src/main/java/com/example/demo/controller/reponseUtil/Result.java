package com.example.demo.controller.reponseUtil;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 17:22 2018/6/1
 * @modified By
 */
public class Result<T> {
    public int code;

    private String msg;

    private T data;
    public Result() {
        this(RestCode.SUCCESS);
    }

    public Result(RestCode resultStatus) {
        this.code = resultStatus.getCode();
        this.msg = resultStatus.getMsg();
    }

    public Result(T data) {
        this.setStatus(RestCode.SUCCESS);
        this.data = data;
    }

    public Result<T> setStatus(RestCode resultStatus) {
        this.code = resultStatus.getCode();
        this.msg = resultStatus.getMsg();
        return this;
    }
    public int getCode() {
        return code;
    }

    public Result<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }
}
