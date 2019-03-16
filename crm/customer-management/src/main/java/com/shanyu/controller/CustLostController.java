package com.shanyu.controller;

import com.shanyu.pojo.CustLost;
import com.shanyu.pojo.CustLostParam;
import com.shanyu.pojo.Customer;
import com.shanyu.service.CustLostService;
import com.shanyu.service.CustomerService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustLostController {
    @Autowired
    private CustLostService custLostService;
    @Autowired
    private CustomerService customerService;

    @PutMapping("/confirmLost")
    public RestResponse confirmLost(@RequestBody CustLost lost) {
        Customer customer = customerService.getByNo(lost.getLst_cust_no());
        customer.setCust_status(3);
        int result = customerService.update(customer);
        if (result > 0) {
            result = custLostService.del(lost);
            if (result > 0) {
                return RestResponse.success(result);
            }
        }
        return RestResponse.error(RestCode.UPDATE_FAILURE);
    }

    @PutMapping("/addDelay")
    public RestResponse addDelay(@RequestBody CustLost lost) {
        lost.setLst_status(2);
        int result = custLostService.update(lost);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/lost/{id}")
    public RestResponse getLostById(@PathVariable("id") int id) {
        CustLost lost = custLostService.getById(id);
        if (lost != null) {
            return RestResponse.success(lost);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/losts")
    public RestResponse getLosts(CustLostParam param) {
        custLostService.setParam(param);
        return RestResponse.success(param);
    }

    @GetMapping("/lostRept")
    public RestResponse getLostRept(CustLostParam param) {
        custLostService.setLostsParam(param);
        return RestResponse.success(param);
    }
}
