package com.shanyu.controller;

import com.shanyu.service.ConsService;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsController {
    @Autowired
    private ConsService consService;

    @GetMapping("/level/{type}")
    public RestResponse getByLevel(@PathVariable("type") int type) {
        return RestResponse.success(consService.getByType(type));
    }
}
