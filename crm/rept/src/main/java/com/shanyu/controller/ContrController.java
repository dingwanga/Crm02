package com.shanyu.controller;

import com.shanyu.pojo.ContrParam;
import com.shanyu.service.ContrService;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContrController {
    @Autowired
    private ContrService contrService;

    @GetMapping("/contrs")
    public RestResponse getContrs(ContrParam param) {
        contrService.setParam(param);
        return RestResponse.success(param);
    }
}
