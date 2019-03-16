package com.shanyu.service;

import com.shanyu.pojo.Linkman;

import java.util.List;

public interface LinkmanService {

    public int add(Linkman linkman);

    public int del(int id);

    public int update(Linkman linkman);

    public List<Linkman> getByCustNo(String cust_no);

    public Linkman getById(int id);
}
