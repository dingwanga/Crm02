package com.shanyu.service.impl;

import com.shanyu.mapper.ContrMapper;
import com.shanyu.pojo.Contr;
import com.shanyu.pojo.ContrParam;
import com.shanyu.service.ContrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContrServiceImpl implements ContrService {
    @Autowired
    private ContrMapper contrMapper;

    @Override
    public void setParam(ContrParam param) {
        param.setList(contrMapper.getList(param));
    }
}
