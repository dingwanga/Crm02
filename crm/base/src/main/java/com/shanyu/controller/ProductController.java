package com.shanyu.controller;

import com.shanyu.pojo.ProductParam;
import com.shanyu.service.ProductService;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public RestResponse getProducts(ProductParam param) {
        productService.setParam(param);
        return RestResponse.success(param);
    }
}
