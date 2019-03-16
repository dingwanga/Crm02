package com.shanyu.util;

public class RestResponse<T> {
    private int code;
    private String msg;
    private T result;

    public static <T> RestResponse<T> success() {
        return new RestResponse<T>();
    }

    public static <T> RestResponse<T> success(T result) {
        RestResponse<T> restResponse = new RestResponse<T>();
        restResponse.setResult(result);
        return restResponse;
    }

    public static <T> RestResponse<T> error(RestCode restCode) {
        return new RestResponse<T>(restCode.code, restCode.msg);
    }

    private RestResponse() {
        this.code = RestCode.OK.code;
        this.msg = RestCode.OK.msg;
    }

    private RestResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RestResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
