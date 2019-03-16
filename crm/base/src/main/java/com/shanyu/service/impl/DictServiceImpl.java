package com.shanyu.service.impl;

import com.shanyu.mapper.DictMapper;
import com.shanyu.pojo.Dict;
import com.shanyu.pojo.DictParam;
import com.shanyu.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictMapper dictMapper;

    @Override
    public int add(Dict dict) {
        return dictMapper.add(dict);
    }

    @Override
    public int del(int id) {
        return dictMapper.del(id);
    }

    @Override
    public int update(Dict dict) {
        return dictMapper.update(dict);
    }

    @Override
    public Dict getById(int id) {
        return dictMapper.getById(id);
    }

    @Override
    public List<Dict> getRegionList() {
        return dictMapper.getListByType("地区");
    }

    @Override
    public List<Dict> getLevelList() {
        return dictMapper.getListByType("企业客户等级");
    }

    @Override
    public void setParam(DictParam param) {
        param.setCount(dictMapper.getCount(param));
        param.setList(dictMapper.getList(param));
    }
}
