package com.shanyu.service.impl;

import com.shanyu.mapper.OrderMapper;
import com.shanyu.pojo.Order;
import com.shanyu.pojo.OrderParam;
import com.shanyu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order getById(int id) {
        return orderMapper.getById(id);
    }

    @Override
    public void setParam(OrderParam param) {
        param.setCount(orderMapper.getCount(param));
        param.setList(orderMapper.getList(param));
    }
}
