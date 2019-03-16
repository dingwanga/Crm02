package com.shanyu.pojo;

import com.shanyu.util.PageBean;

import java.util.List;

public class SalChanceParam extends PageBean {
    private String chc_cust_name;
    private String chc_title;
    private String chc_linkman;
    private Integer chc_due_id;
    private List<SalChance> list;

    public SalChanceParam() {
    }

    public SalChanceParam(int pageNo, int pageSize) {
        super(pageNo, pageSize);
    }

    public String getChc_cust_name() {
        return chc_cust_name;
    }

    public void setChc_cust_name(String chc_cust_name) {
        this.chc_cust_name = chc_cust_name;
    }

    public String getChc_title() {
        return chc_title;
    }

    public void setChc_title(String chc_title) {
        this.chc_title = chc_title;
    }

    public String getChc_linkman() {
        return chc_linkman;
    }

    public void setChc_linkman(String chc_linkman) {
        this.chc_linkman = chc_linkman;
    }

    public Integer getChc_due_id() {
        return chc_due_id;
    }

    public void setChc_due_id(Integer chc_due_id) {
        this.chc_due_id = chc_due_id;
    }

    public List<SalChance> getList() {
        return list;
    }

    public void setList(List<SalChance> list) {
        this.list = list;
    }

}
