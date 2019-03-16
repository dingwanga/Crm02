package com.shanyu.service.impl;

import com.shanyu.mapper.CustActivityMapper;
import com.shanyu.pojo.CustActivity;
import com.shanyu.service.CustActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustActivityServiceImpl implements CustActivityService {
    @Autowired
    private CustActivityMapper custActivityMapper;

    @Override
    public int add(CustActivity activity) {
        return custActivityMapper.add(activity);
    }

    @Override
    public int del(int id) {
        return custActivityMapper.del(id);
    }

    @Override
    public int update(CustActivity activity) {
        return custActivityMapper.update(activity);
    }


    @Override
    public CustActivity getById(int id) {
        return custActivityMapper.getById(id);
    }

    @Override
    public List<CustActivity> getListByCustNo(String cust_no) {
        return custActivityMapper.getListByCustNo(cust_no);
    }
}
