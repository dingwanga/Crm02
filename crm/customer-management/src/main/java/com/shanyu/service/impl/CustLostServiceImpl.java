package com.shanyu.service.impl;

import com.shanyu.mapper.CustLostMapper;
import com.shanyu.pojo.CustLost;
import com.shanyu.pojo.CustLostParam;
import com.shanyu.service.CustLostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustLostServiceImpl implements CustLostService {
    @Autowired
    private CustLostMapper custLostMapper;

    @Override
    public int add(CustLost lost) {
        return custLostMapper.add(lost);
    }

    @Override
    public int del(CustLost lost) {
        lost.setLst_date(new Date());
        lost.setLst_status(3);
        return custLostMapper.update(lost);
    }

    @Override
    public int update(CustLost lost) {
        return custLostMapper.update(lost);
    }

    @Override
    public CustLost getById(int id) {
        return custLostMapper.getById(id);
    }

    @Override
    public void setParam(CustLostParam param) {
        param.setCount(custLostMapper.getCount(param));
        param.setList(custLostMapper.getList(param));
    }

    @Override
    public void setLostsParam(CustLostParam param) {
        param.setCount(custLostMapper.getLostsCount(param));
        param.setList(custLostMapper.getLosts(param));
    }
}
