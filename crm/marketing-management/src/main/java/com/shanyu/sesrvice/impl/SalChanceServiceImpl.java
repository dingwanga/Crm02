package com.shanyu.sesrvice.impl;

import com.shanyu.mapper.SalChanceMapper;
import com.shanyu.mapper.SalPlanMapper;
import com.shanyu.pojo.SalChance;
import com.shanyu.pojo.SalChanceParam;
import com.shanyu.service.SalChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SalChanceServiceImpl implements SalChanceService {
    @Autowired
    private SalChanceMapper salChanceMapper;
    @Autowired
    private SalPlanMapper salPlanMapper;

    @Override
    public int add(SalChance chance) {
        chance.setChc_create_date(new Date());
        chance.setChc_status(1);
        return salChanceMapper.add(chance);
    }

    @Override
    public int del(int id) {
        salPlanMapper.delByChcId(id);
        return salChanceMapper.del(id);
    }

    @Override
    public int update(SalChance chance) {
        return salChanceMapper.update(chance);
    }

    @Override
    public SalChance getById(int id) {
        return salChanceMapper.getById(id);
    }

    @Override
    public void setParam(SalChanceParam param) {
        param.setCount(salChanceMapper.getCount(param));
        param.setList(salChanceMapper.getByParam(param));
    }

    @Override
    public int stopSalChance(int id) {
        SalChance chance = salChanceMapper.getById(id);
        chance.setChc_status(4);
        return salChanceMapper.update(chance);
    }

}
