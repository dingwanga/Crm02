package com.shanyu.service;

import com.shanyu.pojo.Order;
import com.shanyu.pojo.OrderParam;

public interface OrderService {

    public Order getById(int id);

    public void setParam(OrderParam param);
}
