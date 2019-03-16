package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class CustomerParam extends PageBean {
    private String cust_no;
    private String cust_name;
    private Integer cust_region = 0;
    private String cust_manager_name;
    private Integer cust_level = 0;
    private List<Customer> list;

    public CustomerParam() {
    }

    public CustomerParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
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

    public Integer getCust_region() {
        return cust_region;
    }

    public void setCust_region(Integer cust_region) {
        this.cust_region = cust_region;
    }

    public String getCust_manager_name() {
        return cust_manager_name;
    }

    public void setCust_manager_name(String cust_manager_name) {
        this.cust_manager_name = cust_manager_name;
    }

    public Integer getCust_level() {
        return cust_level;
    }

    public void setCust_level(Integer cust_level) {
        this.cust_level = cust_level;
    }

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }


}
