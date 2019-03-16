package com.shanyu.pojo;

import java.util.List;

public class ContrParam {
    private String cust_name;
    private Integer date = 0;
    private List<Contr> list;

    public ContrParam() {
    }

    public ContrParam(String cust_name, Integer date, List<Contr> list) {
        this.cust_name = cust_name;
        this.date = date;
        this.list = list;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public List<Contr> getList() {
        return list;
    }

    public void setList(List<Contr> list) {
        this.list = list;
    }
}
