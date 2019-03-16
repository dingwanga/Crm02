package com.shanyu.service;

import com.shanyu.pojo.Dict;
import com.shanyu.pojo.DictParam;

import java.util.List;

public interface DictService {

    public int add(Dict dict);

    public int del(int id);

    public int update(Dict dict);

    public Dict getById(int id);

    public List<Dict> getRegionList();

    public List<Dict> getLevelList();

    public void setParam(DictParam param);

}
