package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class ProductParam extends PageBean {
    private String pro_name;
    private String pro_type;
    private String pro_batch;
    private List<Product> list;

    public ProductParam() {
    }

    public ProductParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
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

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }
}
