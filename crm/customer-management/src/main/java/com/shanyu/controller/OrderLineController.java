package com.shanyu.controller;

import com.shanyu.service.OrderLineService;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderLineController {
    @Autowired
    private OrderLineService orderLineService;

    @GetMapping("/orderlines/{odr_id}")
    public RestResponse getOrderLines(@PathVariable("odr_id") int odr_id) {
        return RestResponse.success(orderLineService.getListByOdrId(odr_id));
    }
}
