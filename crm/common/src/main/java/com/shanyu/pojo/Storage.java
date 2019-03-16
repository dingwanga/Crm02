package com.shanyu.pojo;

import java.io.Serializable;

public class Storage implements Serializable {
    private Integer stk_id;
    private String stk_ware;
    private String stk_warehouse;
    private Integer stk_prod_id;
    private Integer stk_count;
    private String stk_memo;
    private String stk_prod_name;

    public Storage() {
    }

    public Storage(Integer stk_id, String stk_ware, String stk_warehouse, Integer stk_prod_id, Integer stk_count, String stk_memo, String stk_prod_name) {
        this.stk_id = stk_id;
        this.stk_ware = stk_ware;
        this.stk_warehouse = stk_warehouse;
        this.stk_prod_id = stk_prod_id;
        this.stk_count = stk_count;
        this.stk_memo = stk_memo;
        this.stk_prod_name = stk_prod_name;
    }

    public Integer getStk_id() {
        return stk_id;
    }

    public void setStk_id(Integer stk_id) {
        this.stk_id = stk_id;
    }

    public String getStk_ware() {
        return stk_ware;
    }

    public void setStk_ware(String stk_ware) {
        this.stk_ware = stk_ware;
    }

    public String getStk_warehouse() {
        return stk_warehouse;
    }

    public void setStk_warehouse(String stk_warehouse) {
        this.stk_warehouse = stk_warehouse;
    }

    public Integer getStk_prod_id() {
        return stk_prod_id;
    }

    public void setStk_prod_id(Integer stk_prod_id) {
        this.stk_prod_id = stk_prod_id;
    }

    public Integer getStk_count() {
        return stk_count;
    }

    public void setStk_count(Integer stk_count) {
        this.stk_count = stk_count;
    }

    public String getStk_memo() {
        return stk_memo;
    }

    public void setStk_memo(String stk_memo) {
        this.stk_memo = stk_memo;
    }

    public String getStk_prod_name() {
        return stk_prod_name;
    }

    public void setStk_prod_name(String stk_prod_name) {
        this.stk_prod_name = stk_prod_name;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "stk_id=" + stk_id +
                ", stk_ware='" + stk_ware + '\'' +
                ", stk_warehouse='" + stk_warehouse + '\'' +
                ", stk_prod_id=" + stk_prod_id +
                ", stk_count=" + stk_count +
                ", stk_memo='" + stk_memo + '\'' +
                ", stk_prod_name='" + stk_prod_name + '\'' +
                '}';
    }
}
