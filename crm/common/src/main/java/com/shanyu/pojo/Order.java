package com.shanyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer odr_id;
    private String odr_cust_no;
    private Date odr_date;
    private String odr_addr;
    private Integer odr_status;
    private Double odr_amount = 0.0;

    public Order() {
    }

    public Order(Integer odr_id, String odr_cust_no, Date odr_date, String odr_addr, Integer odr_status, Double odr_amount) {
        this.odr_id = odr_id;
        this.odr_cust_no = odr_cust_no;
        this.odr_date = odr_date;
        this.odr_addr = odr_addr;
        this.odr_status = odr_status;
        this.odr_amount = odr_amount;
    }

    public Integer getOdr_id() {
        return odr_id;
    }

    public void setOdr_id(Integer odr_id) {
        this.odr_id = odr_id;
    }

    public String getOdr_cust_no() {
        return odr_cust_no;
    }

    public void setOdr_cust_no(String odr_cust_no) {
        this.odr_cust_no = odr_cust_no;
    }

    public Date getOdr_date() {
        return odr_date;
    }

    public void setOdr_date(Date odr_date) {
        this.odr_date = odr_date;
    }

    public String getOdr_addr() {
        return odr_addr;
    }

    public void setOdr_addr(String odr_addr) {
        this.odr_addr = odr_addr;
    }

    public Integer getOdr_status() {
        return odr_status;
    }

    public void setOdr_status(Integer odr_status) {
        this.odr_status = odr_status;
    }

    public Double getOdr_amount() {
        return odr_amount;
    }

    public void setOdr_amount(Double odr_amount) {
        this.odr_amount = odr_amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "odr_id=" + odr_id +
                ", odr_cust_no='" + odr_cust_no + '\'' +
                ", odr_date=" + odr_date +
                ", odr_addr='" + odr_addr + '\'' +
                ", odr_status=" + odr_status +
                ", odr_amount=" + odr_amount +
                '}';
    }
}
