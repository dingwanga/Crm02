package com.shanyu.service.impl;

import com.shanyu.mapper.ConsMapper;
import com.shanyu.pojo.Cons;
import com.shanyu.service.ConsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsServiceImpl implements ConsService {
    @Autowired
    private ConsMapper consMapper;


    @Override
    public List<Cons> getByType(int type) {
        if (type == 2) {
            return consMapper.getByCredit();
        } else if (type == 3) {
            return consMapper.getBySatisfy();
        } else {
            return consMapper.getByLevel();
        }
    }
}
