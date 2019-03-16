package com.shanyu.pojo;

import java.io.Serializable;

public class Contr implements Serializable {
    private String cust_no;
    private String cust_name;
    private Double total;

    public Contr() {
    }

    public Contr(String cust_no, String cust_name, Double total) {
        this.cust_no = cust_no;
        this.cust_name = cust_name;
        this.total = total;
    }

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Contr{" +
                "cust_no='" + cust_no + '\'' +
                ", cust_name='" + cust_name + '\'' +
                ", total=" + total +
                '}';
    }
}
