package com.shanyu.pojo;

import java.io.Serializable;

public class Linkman implements Serializable {
    private Integer lkm_id;
    private String lkm_cust_no;
    private String lkm_name;
    private Integer lkm_sex;
    private String lkm_position;
    private String lkm_tel;
    private String lkm_mobile;
    private String lkm_memo;
    private String lkm_cust_name;

    public Linkman() {
    }

    public Linkman(Integer lkm_id, String lkm_cust_no, String lkm_name, Integer lkm_sex, String lkm_position, String lkm_tel, String lkm_mobile, String lkm_memo, String lkm_cust_name) {
        this.lkm_id = lkm_id;
        this.lkm_cust_no = lkm_cust_no;
        this.lkm_name = lkm_name;
        this.lkm_sex = lkm_sex;
        this.lkm_position = lkm_position;
        this.lkm_tel = lkm_tel;
        this.lkm_mobile = lkm_mobile;
        this.lkm_memo = lkm_memo;
        this.lkm_cust_name = lkm_cust_name;
    }

    public Integer getLkm_id() {
        return lkm_id;
    }

    public void setLkm_id(Integer lkm_id) {
        this.lkm_id = lkm_id;
    }

    public String getLkm_cust_no() {
        return lkm_cust_no;
    }

    public void setLkm_cust_no(String lkm_cust_no) {
        this.lkm_cust_no = lkm_cust_no;
    }

    public String getLkm_name() {
        return lkm_name;
    }

    public void setLkm_name(String lkm_name) {
        this.lkm_name = lkm_name;
    }

    public Integer getLkm_sex() {
        return lkm_sex;
    }

    public void setLkm_sex(Integer lkm_sex) {
        this.lkm_sex = lkm_sex;
    }

    public String getLkm_position() {
        return lkm_position;
    }

    public void setLkm_position(String lkm_position) {
        this.lkm_position = lkm_position;
    }

    public String getLkm_tel() {
        return lkm_tel;
    }

    public void setLkm_tel(String lkm_tel) {
        this.lkm_tel = lkm_tel;
    }

    public String getLkm_mobile() {
        return lkm_mobile;
    }

    public void setLkm_mobile(String lkm_mobile) {
        this.lkm_mobile = lkm_mobile;
    }

    public String getLkm_memo() {
        return lkm_memo;
    }

    public void setLkm_memo(String lkm_memo) {
        this.lkm_memo = lkm_memo;
    }

    public String getLkm_cust_name() {
        return lkm_cust_name;
    }

    public void setLkm_cust_name(String lkm_cust_name) {
        this.lkm_cust_name = lkm_cust_name;
    }

    @Override
    public String toString() {
        return "Linkman{" +
                "lkm_id=" + lkm_id +
                ", lkm_cust_no='" + lkm_cust_no + '\'' +
                ", lkm_name='" + lkm_name + '\'' +
                ", lkm_sex=" + lkm_sex +
                ", lkm_postion='" + lkm_position + '\'' +
                ", lkm_tel='" + lkm_tel + '\'' +
                ", lkm_mobile='" + lkm_mobile + '\'' +
                ", lkm_memo='" + lkm_memo + '\'' +
                ", lkm_cust_name='" + lkm_cust_name + '\'' +
                '}';
    }
}
