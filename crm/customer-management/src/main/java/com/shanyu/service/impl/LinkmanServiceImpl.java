package com.shanyu.service.impl;

import com.shanyu.mapper.LinkmanMapper;
import com.shanyu.pojo.Linkman;
import com.shanyu.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkmanServiceImpl implements LinkmanService {
    @Autowired
    private LinkmanMapper linkmanMapper;


    @Override
    public int add(Linkman linkman) {
        return linkmanMapper.add(linkman);
    }

    @Override
    public int del(int id) {
        return linkmanMapper.del(id);
    }

    @Override
    public int update(Linkman linkman) {
        return linkmanMapper.update(linkman);
    }

    @Override
    public List<Linkman> getByCustNo(String cust_no) {
        return linkmanMapper.getByCustNo(cust_no);
    }

    @Override
    public Linkman getById(int id) {
        return linkmanMapper.getById(id);
    }
}
