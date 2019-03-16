package com.shanyu.util;

public enum RestCode {
    OK(0,"OK"),
    LOGIN_ERROR(1,"用户名或密码不正确"),
    TOKEN_INVALID(2,"登录失效，请重新登陆"),
    ADD_FAILURE(3,"新建失败"),
    DEL_FAILURE(4,"删除失败"),
    UPDATE_FAILURE(5,"修改失败"),
    ID_INVALID(6,"该编号不存在");

    public final int code;
    public final String msg;

    private RestCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
