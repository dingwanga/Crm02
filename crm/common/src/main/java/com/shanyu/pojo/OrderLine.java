package com.shanyu.pojo;

import java.io.Serializable;

public class OrderLine implements Serializable {
    private Integer odl_id;
    private Integer odl_odr_id;
    private Integer odl_pro_id;
    private Integer odl_count;
    private Double odl_price;
    private String odl_pro_name;
    private String odl_pro_unit;
    private Double odl_pro_price;

    public OrderLine() {
    }

    public OrderLine(Integer odl_id, Integer odl_odr_id, Integer odl_pro_id, Integer odl_count, Double odl_price, String odl_pro_name, String odl_pro_unit, Double odl_pro_price) {
        this.odl_id = odl_id;
        this.odl_odr_id = odl_odr_id;
        this.odl_pro_id = odl_pro_id;
        this.odl_count = odl_count;
        this.odl_price = odl_price;
        this.odl_pro_name = odl_pro_name;
        this.odl_pro_unit = odl_pro_unit;
        this.odl_pro_price = odl_pro_price;
    }

    public Integer getOdl_id() {
        return odl_id;
    }

    public void setOdl_id(Integer odl_id) {
        this.odl_id = odl_id;
    }

    public Integer getOdl_odr_id() {
        return odl_odr_id;
    }

    public void setOdl_odr_id(Integer odl_odr_id) {
        this.odl_odr_id = odl_odr_id;
    }

    public Integer getOdl_pro_id() {
        return odl_pro_id;
    }

    public void setOdl_pro_id(Integer odl_pro_id) {
        this.odl_pro_id = odl_pro_id;
    }

    public Integer getOdl_count() {
        return odl_count;
    }

    public void setOdl_count(Integer odl_count) {
        this.odl_count = odl_count;
    }

    public Double getOdl_price() {
        return odl_price;
    }

    public void setOdl_price(Double odl_price) {
        this.odl_price = odl_price;
    }

    public String getOdl_pro_name() {
        return odl_pro_name;
    }

    public void setOdl_pro_name(String odl_pro_name) {
        this.odl_pro_name = odl_pro_name;
    }

    public String getOdl_pro_unit() {
        return odl_pro_unit;
    }

    public void setOdl_pro_unit(String odl_pro_unit) {
        this.odl_pro_unit = odl_pro_unit;
    }

    public Double getOdl_pro_price() {
        return odl_pro_price;
    }

    public void setOdl_pro_price(Double odl_pro_price) {
        this.odl_pro_price = odl_pro_price;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "odl_id=" + odl_id +
                ", odl_odr_id=" + odl_odr_id +
                ", odl_pro_id=" + odl_pro_id +
                ", odl_count=" + odl_count +
                ", odl_price=" + odl_price +
                ", odl_pro_name='" + odl_pro_name + '\'' +
                ", odl_pro_unit='" + odl_pro_unit + '\'' +
                ", odl_pro_price=" + odl_pro_price +
                '}';
    }
}
