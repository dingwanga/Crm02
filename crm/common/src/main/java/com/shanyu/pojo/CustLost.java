package com.shanyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class CustLost implements Serializable {
    private Integer lst_id;
    private String lst_cust_no;
    private Integer lst_manager_id;
    private Date lst_date;
    private String lst_delay;
    private String lst_reason;
    private Integer lst_status;
    private String lst_cust_name;
    private String lst_manager_name;
    private Date lst_last_order;

    public CustLost() {
    }

    public CustLost(Integer lst_id, String lst_cust_no, Integer lst_manager_id, Date lst_date, String lst_delay, String lst_reason, Integer lst_status, String lst_cust_name, String lst_manager_name, Date lst_last_order) {
        this.lst_id = lst_id;
        this.lst_cust_no = lst_cust_no;
        this.lst_manager_id = lst_manager_id;
        this.lst_date = lst_date;
        this.lst_delay = lst_delay;
        this.lst_reason = lst_reason;
        this.lst_status = lst_status;
        this.lst_cust_name = lst_cust_name;
        this.lst_manager_name = lst_manager_name;
        this.lst_last_order = lst_last_order;
    }

    public Integer getLst_id() {
        return lst_id;
    }

    public void setLst_id(Integer lst_id) {
        this.lst_id = lst_id;
    }

    public String getLst_cust_no() {
        return lst_cust_no;
    }

    public void setLst_cust_no(String lst_cust_no) {
        this.lst_cust_no = lst_cust_no;
    }

    public Integer getLst_manager_id() {
        return lst_manager_id;
    }

    public void setLst_manager_id(Integer lst_manager_id) {
        this.lst_manager_id = lst_manager_id;
    }

    public Date getLst_date() {
        return lst_date;
    }

    public void setLst_date(Date lst_date) {
        this.lst_date = lst_date;
    }

    public String getLst_delay() {
        return lst_delay;
    }

    public void setLst_delay(String lst_delay) {
        this.lst_delay = lst_delay;
    }

    public String getLst_reason() {
        return lst_reason;
    }

    public void setLst_reason(String lst_reason) {
        this.lst_reason = lst_reason;
    }

    public Integer getLst_status() {
        return lst_status;
    }

    public void setLst_status(Integer lst_status) {
        this.lst_status = lst_status;
    }

    public String getLst_cust_name() {
        return lst_cust_name;
    }

    public void setLst_cust_name(String lst_cust_name) {
        this.lst_cust_name = lst_cust_name;
    }

    public String getLst_manager_name() {
        return lst_manager_name;
    }

    public void setLst_manager_name(String lst_manager_name) {
        this.lst_manager_name = lst_manager_name;
    }

    public Date getLst_last_order() {
        return lst_last_order;
    }

    public void setLst_last_order(Date lst_last_order) {
        this.lst_last_order = lst_last_order;
    }

    @Override
    public String toString() {
        return "CustLost{" +
                "lst_id=" + lst_id +
                ", lst_cust_no='" + lst_cust_no + '\'' +
                ", lst_manager_id=" + lst_manager_id +
                ", lst_date=" + lst_date +
                ", lst_delay='" + lst_delay + '\'' +
                ", lst_reason='" + lst_reason + '\'' +
                ", lst_status=" + lst_status +
                ", lst_cust_name='" + lst_cust_name + '\'' +
                ", lst_manager_name='" + lst_manager_name + '\'' +
                ", lst_last_order=" + lst_last_order +
                '}';
    }
}
