package com.shanyu.service.impl;

import com.shanyu.mapper.ProductMapper;
import com.shanyu.pojo.ProductParam;
import com.shanyu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void setParam(ProductParam param) {
        param.setCount(productMapper.getCount(param));
        param.setList(productMapper.getList(param));
    }
}
