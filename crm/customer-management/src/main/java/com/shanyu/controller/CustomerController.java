package com.shanyu.controller;

import com.shanyu.pojo.CustLost;
import com.shanyu.pojo.Customer;
import com.shanyu.pojo.CustomerParam;
import com.shanyu.service.CustLostService;
import com.shanyu.service.CustomerService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustLostService custLostService;

    @DeleteMapping("/customer/{no}")
    public RestResponse delCust(@PathVariable("no") String no) {
        int result = customerService.del(no);
        if (result > 0) {
            CustLost lost = new CustLost();
            lost.setLst_cust_no(no);
            result = custLostService.add(lost);
            if (result > 0) {
                return RestResponse.success(result);
            }
        }
        return RestResponse.error(RestCode.DEL_FAILURE);
    }

    @PutMapping("/customer")
    public RestResponse updateCust(@RequestBody Customer customer) {
        int result = customerService.update(customer);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/customer/{id}")
    public RestResponse getCustById(@PathVariable("id") int id) {
        Customer c = customerService.getById(id);
        if (c != null) {
            return RestResponse.success(c);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/customer")
    public RestResponse getCustByNo(String no) {
        Customer c = customerService.getByNo(no);
        if (c != null) {
            return RestResponse.success(c);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/list")
    public RestResponse getCustList(CustomerParam param) {
        customerService.setParam(param);
        return RestResponse.success(param);
    }
}
