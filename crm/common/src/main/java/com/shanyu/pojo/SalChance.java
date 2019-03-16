package com.shanyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class SalChance implements Serializable {
    private Integer chc_id;
    private String chc_source;
    private String chc_cust_name;
    private String chc_title;
    private Integer chc_rate;
    private String chc_linkman;
    private String chc_tel;
    private String chc_desc;
    private Integer chc_create_id;
    private Date chc_create_date;
    private Integer chc_due_id;
    private Date chc_due_date;
    private Integer chc_status;
    private String chc_create_by;
    private String chc_due_to;
    private String chc_status_value;

    public SalChance() {
    }

    public SalChance(Integer chc_id, String chc_source, String chc_cust_name, String chc_title, Integer chc_rate, String chc_linkman, String chc_tel, String chc_desc, Integer chc_create_id, Date chc_create_date, Integer chc_due_id, Date chc_due_date, Integer chc_status, String chc_create_by, String chc_due_to, String chc_status_value) {
        this.chc_id = chc_id;
        this.chc_source = chc_source;
        this.chc_cust_name = chc_cust_name;
        this.chc_title = chc_title;
        this.chc_rate = chc_rate;
        this.chc_linkman = chc_linkman;
        this.chc_tel = chc_tel;
        this.chc_desc = chc_desc;
        this.chc_create_id = chc_create_id;
        this.chc_create_date = chc_create_date;
        this.chc_due_id = chc_due_id;
        this.chc_due_date = chc_due_date;
        this.chc_status = chc_status;
        this.chc_create_by = chc_create_by;
        this.chc_due_to = chc_due_to;
        this.chc_status_value = chc_status_value;
    }

    public Integer getChc_id() {
        return chc_id;
    }

    public void setChc_id(Integer chc_id) {
        this.chc_id = chc_id;
    }

    public String getChc_source() {
        return chc_source;
    }

    public void setChc_source(String chc_source) {
        this.chc_source = chc_source;
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

    public Integer getChc_rate() {
        return chc_rate;
    }

    public void setChc_rate(Integer chc_rate) {
        this.chc_rate = chc_rate;
    }

    public String getChc_linkman() {
        return chc_linkman;
    }

    public void setChc_linkman(String chc_linkman) {
        this.chc_linkman = chc_linkman;
    }

    public String getChc_tel() {
        return chc_tel;
    }

    public void setChc_tel(String chc_tel) {
        this.chc_tel = chc_tel;
    }

    public String getChc_desc() {
        return chc_desc;
    }

    public void setChc_desc(String chc_desc) {
        this.chc_desc = chc_desc;
    }

    public Integer getChc_create_id() {
        return chc_create_id;
    }

    public void setChc_create_id(Integer chc_create_id) {
        this.chc_create_id = chc_create_id;
    }

    public Date getChc_create_date() {
        return chc_create_date;
    }

    public void setChc_create_date(Date chc_create_date) {
        this.chc_create_date = chc_create_date;
    }

    public Integer getChc_due_id() {
        return chc_due_id;
    }

    public void setChc_due_id(Integer chc_due_id) {
        this.chc_due_id = chc_due_id;
    }

    public Date getChc_due_date() {
        return chc_due_date;
    }

    public void setChc_due_date(Date chc_due_date) {
        this.chc_due_date = chc_due_date;
    }

    public Integer getChc_status() {
        return chc_status;
    }

    public void setChc_status(Integer chc_status) {
        this.chc_status = chc_status;
    }

    public String getChc_create_by() {
        return chc_create_by;
    }

    public void setChc_create_by(String chc_create_by) {
        this.chc_create_by = chc_create_by;
    }

    public String getChc_due_to() {
        return chc_due_to;
    }

    public void setChc_due_to(String chc_due_to) {
        this.chc_due_to = chc_due_to;
    }

    public String getChc_status_value() {
        return chc_status_value;
    }

    public void setChc_status_value(String chc_status_value) {
        this.chc_status_value = chc_status_value;
    }

    @Override
    public String toString() {
        return "SalChance{" +
                "chc_id=" + chc_id +
                ", chc_source='" + chc_source + '\'' +
                ", chc_cust_name='" + chc_cust_name + '\'' +
                ", chc_title='" + chc_title + '\'' +
                ", chc_rate=" + chc_rate +
                ", chc_linkman='" + chc_linkman + '\'' +
                ", chc_tel='" + chc_tel + '\'' +
                ", chc_desc='" + chc_desc + '\'' +
                ", chc_create_id=" + chc_create_id +
                ", chc_create_date=" + chc_create_date +
                ", chc_due_id=" + chc_due_id +
                ", chc_due_date=" + chc_due_date +
                ", chc_status=" + chc_status +
                ", chc_create_by='" + chc_create_by + '\'' +
                ", chc_due_to='" + chc_due_to + '\'' +
                ", chc_status_value='" + chc_status_value + '\'' +
                '}';
    }
}
