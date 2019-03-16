package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class CustLostParam extends PageBean {
    private String lst_cust_name;
    private String lst_manager_name;
    private Integer lst_status =0 ;
    private List<CustLost> list;

    public CustLostParam() {
    }

    public CustLostParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
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

    public Integer getLst_status() {
        return lst_status;
    }

    public void setLst_status(Integer lst_status) {
        this.lst_status = lst_status;
    }

    public List<CustLost> getList() {
        return list;
    }

    public void setList(List<CustLost> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CustLostParam{" +
                "lst_cust_name='" + lst_cust_name + '\'' +
                ", lst_manager_name='" + lst_manager_name + '\'' +
                ", lst_status=" + lst_status +
                ", list=" + list +
                '}';
    }
}
