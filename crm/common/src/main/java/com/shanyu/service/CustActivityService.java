package com.shanyu.service;

import com.shanyu.pojo.CustActivity;

import java.util.List;

public interface CustActivityService {

    public int add(CustActivity activity);

    public int del(int id);

    public int update(CustActivity activity);

    public CustActivity getById(int id);

    public List<CustActivity> getListByCustNo(String cust_no);
}
