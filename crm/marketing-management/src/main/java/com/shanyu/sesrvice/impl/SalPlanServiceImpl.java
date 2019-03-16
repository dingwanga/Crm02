package com.shanyu.sesrvice.impl;

import com.shanyu.mapper.SalChanceMapper;
import com.shanyu.mapper.SalPlanMapper;
import com.shanyu.pojo.SalPlan;
import com.shanyu.pojo.SalPlanParam;
import com.shanyu.service.SalPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalPlanServiceImpl implements SalPlanService {
    @Autowired
    private SalPlanMapper salPlanMapper;
    @Autowired
    private SalChanceMapper salChanceMapper;

    @Override
    public int add(SalPlan plan) {
        return salPlanMapper.add(plan);
    }

    @Override
    public int del(int id) {
        return salPlanMapper.del(id);
    }

    @Override
    public int update(SalPlan plan) {
        return salPlanMapper.update(plan);
    }

    @Override
    public SalPlanParam getSalPlanParamByChcId(int chc_id) {
        return new SalPlanParam(salChanceMapper.getById(chc_id), salPlanMapper.getByChcId(chc_id));
    }
}
