package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class OrderParam extends PageBean {
    private String odr_cust_no;
    private List<Order> list;

    public OrderParam() {
    }

    public OrderParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
    }

    public String getOdr_cust_no() {
        return odr_cust_no;
    }

    public void setOdr_cust_no(String odr_cust_no) {
        this.odr_cust_no = odr_cust_no;
    }

    public List<Order> getList() {
        return list;
    }

    public void setList(List<Order> list) {
        this.list = list;
    }
}
