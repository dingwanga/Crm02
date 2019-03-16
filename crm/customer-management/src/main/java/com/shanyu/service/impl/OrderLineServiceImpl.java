package com.shanyu.service.impl;

import com.shanyu.mapper.OrderLineMapper;
import com.shanyu.pojo.OrderLine;
import com.shanyu.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineServiceImpl implements OrderLineService {
    @Autowired
    private OrderLineMapper orderLineMapper;

    @Override
    public List<OrderLine> getListByOdrId(int odr_id) {
        return orderLineMapper.getListByOdrId(odr_id);
    }
}
