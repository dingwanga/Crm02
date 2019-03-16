package com.shanyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class SalPlan implements Serializable {
    private Integer pla_id;
    private Integer pla_chc_id;
    private Date pla_date;
    private String pla_todo;
    private String pla_result;

    public SalPlan() {
    }

    public SalPlan(Integer pla_id, Integer pla_chc_id, Date pla_date, String pla_todo, String pla_result) {
        this.pla_id = pla_id;
        this.pla_chc_id = pla_chc_id;
        this.pla_date = pla_date;
        this.pla_todo = pla_todo;
        this.pla_result = pla_result;
    }

    public Integer getPla_id() {
        return pla_id;
    }

    public void setPla_id(Integer pla_id) {
        this.pla_id = pla_id;
    }

    public Integer getPla_chc_id() {
        return pla_chc_id;
    }

    public void setPla_chc_id(Integer pla_chc_id) {
        this.pla_chc_id = pla_chc_id;
    }

    public Date getPla_date() {
        return pla_date;
    }

    public void setPla_date(Date pla_date) {
        this.pla_date = pla_date;
    }

    public String getPla_todo() {
        return pla_todo;
    }

    public void setPla_todo(String pla_todo) {
        this.pla_todo = pla_todo;
    }

    public String getPla_result() {
        return pla_result;
    }

    public void setPla_result(String pla_result) {
        this.pla_result = pla_result;
    }

    @Override
    public String toString() {
        return "SalPlan{" +
                "pla_id=" + pla_id +
                ", pla_chc_id=" + pla_chc_id +
                ", pla_date=" + pla_date +
                ", pla_todo='" + pla_todo + '\'' +
                ", pla_result='" + pla_result + '\'' +
                '}';
    }
}
