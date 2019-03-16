package com.shanyu.pojo;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer pro_id;
    private String pro_name;
    private String pro_type;
    private String pro_batch;
    private String pro_unit;
    private Double pro_price;
    private String pro_memo;

    public Product() {
    }

    public Product(Integer pro_id, String pro_name, String pro_type, String pro_batch, String pro_unit, Double pro_price, String pro_memo) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
        this.pro_type = pro_type;
        this.pro_batch = pro_batch;
        this.pro_unit = pro_unit;
        this.pro_price = pro_price;
        this.pro_memo = pro_memo;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_type() {
        return pro_type;
    }

    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    public String getPro_batch() {
        return pro_batch;
    }

    public void setPro_batch(String pro_batch) {
        this.pro_batch = pro_batch;
    }

    public String getPro_unit() {
        return pro_unit;
    }

    public void setPro_unit(String pro_unit) {
        this.pro_unit = pro_unit;
    }

    public Double getPro_price() {
        return pro_price;
    }

    public void setPro_price(Double pro_price) {
        this.pro_price = pro_price;
    }

    public String getPro_memo() {
        return pro_memo;
    }

    public void setPro_memo(String pro_memo) {
        this.pro_memo = pro_memo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pro_id=" + pro_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_type='" + pro_type + '\'' +
                ", pro_batch='" + pro_batch + '\'' +
                ", pro_unit='" + pro_unit + '\'' +
                ", pro_price=" + pro_price +
                ", pro_memo='" + pro_memo + '\'' +
                '}';
    }
}
