package com.shanyu.service.impl;

import com.shanyu.mapper.StorageMapper;
import com.shanyu.pojo.StorageParam;
import com.shanyu.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void setParam(StorageParam param) {
        param.setCount(storageMapper.getCount(param));
        param.setList(storageMapper.getList(param));
    }
}
