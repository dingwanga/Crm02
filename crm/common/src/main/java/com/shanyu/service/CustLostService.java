package com.shanyu.service;

import com.shanyu.pojo.CustLost;
import com.shanyu.pojo.CustLostParam;

public interface CustLostService {

    public int add(CustLost lost);

    public int del(CustLost lost);

    public int update(CustLost lost);

    public CustLost getById(int id);

    public void setParam(CustLostParam param);

    public void setLostsParam(CustLostParam param);
}
