package com.shanyu.pojo;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer usr_id;
    private String usr_name;
    private String usr_password;
    private Integer usr_role_id;
    private Integer usr_flag;
    private String role_name;
    private String token;

    public SysUser() {
    }

    public SysUser(Integer usr_id, String usr_name, String usr_password, Integer usr_role_id, Integer usr_flag, String role_name) {
        this.usr_id = usr_id;
        this.usr_name = usr_name;
        this.usr_password = usr_password;
        this.usr_role_id = usr_role_id;
        this.usr_flag = usr_flag;
        this.role_name = role_name;
    }

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public Integer getUsr_role_id() {
        return usr_role_id;
    }

    public void setUsr_role_id(Integer usr_role_id) {
        this.usr_role_id = usr_role_id;
    }

    public Integer getUsr_flag() {
        return usr_flag;
    }

    public void setUsr_flag(Integer usr_flag) {
        this.usr_flag = usr_flag;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
