package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class StorageParam extends PageBean {
    private String stk_prod_name;
    private String stk_warehouse;
    private List<Storage> list;

    public StorageParam() {
    }

    public StorageParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
    }

    public String getStk_prod_name() {
        return stk_prod_name;
    }

    public void setStk_prod_name(String stk_prod_name) {
        this.stk_prod_name = stk_prod_name;
    }

    public String getStk_warehouse() {
        return stk_warehouse;
    }

    public void setStk_warehouse(String stk_warehouse) {
        this.stk_warehouse = stk_warehouse;
    }

    public List<Storage> getList() {
        return list;
    }

    public void setList(List<Storage> list) {
        this.list = list;
    }
}
