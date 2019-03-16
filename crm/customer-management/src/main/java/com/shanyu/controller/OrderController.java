package com.shanyu.controller;

import com.shanyu.pojo.Order;
import com.shanyu.pojo.OrderParam;
import com.shanyu.service.OrderService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public RestResponse getOrderById(@PathVariable("id") int id) {
        Order order = orderService.getById(id);
        if (order != null) {
            return RestResponse.success(order);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/orders")
    public RestResponse getOrders(OrderParam param) {
        orderService.setParam(param);
        return RestResponse.success(param);
    }
}
