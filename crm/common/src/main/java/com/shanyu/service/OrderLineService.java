package com.shanyu.service;

import com.shanyu.pojo.OrderLine;

import java.util.List;

public interface OrderLineService {

    public List<OrderLine> getListByOdrId(int odr_id);
}
