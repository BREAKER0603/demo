package com.example.demo.controller.reponseUtil;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 11:40 2018/6/7
 * @modified By
 */
public class RestResponse {
    private final static String SUCCESS = "success";

    public static <T> Result<T> makeOKRsp() {
        return new Result<T>().setCode(RestCode.SUCCESS.getCode()).setMsg(SUCCESS);
    }

    public static <T> Result<T> makeOKRsp(T data) {
        return new Result<T>().setCode(RestCode.SUCCESS.getCode()).setMsg(SUCCESS).setData(data);
    }

    public static <T> Result<T> makeErrRsp(String message) {
        return new Result<T>().setCode(RestCode.FAIL.getCode()).setMsg(SUCCESS);
    }

    public static <T> Result<T> makeRsp(int code, String msg) {
        return new Result<T>().setCode(code).setMsg(msg);
    }

    public static <T> Result<T> makeRsp(int code, String msg, T data) {
        return new Result<T>().setCode(code).setMsg(msg).setData(data);
    }
}
