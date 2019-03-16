package com.shanyu.controller;

import com.shanyu.pojo.StorageParam;
import com.shanyu.service.StorageService;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("/storages")
    public RestResponse getStorages(StorageParam param) {
        storageService.setParam(param);
        return RestResponse.success(param);
    }
}
