package com.shanyu.controller;

import com.shanyu.pojo.CustActivity;
import com.shanyu.service.CustActivityService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustActivityController {
    @Autowired
    private CustActivityService custActivityService;

    @PostMapping("/activity")
    public RestResponse addActivity(@RequestBody CustActivity activity) {
        int result = custActivityService.add(activity);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.ADD_FAILURE);
        }
    }

    @DeleteMapping("/activity/{id}")
    public RestResponse delActivity(@PathVariable("id") int id) {
        int result = custActivityService.del(id);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.DEL_FAILURE);
        }
    }

    @PutMapping("/activity")
    public RestResponse updateActivity(@RequestBody CustActivity activity) {
        int result = custActivityService.update(activity);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/activity/{id}")
    public RestResponse getActivityById(@PathVariable("id") int id) {
        CustActivity activity = custActivityService.getById(id);
        if (activity != null) {
            return RestResponse.success(activity);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/activities/{no}")
    public RestResponse getActivities(@PathVariable("no") String cust_no) {
        return RestResponse.success(custActivityService.getListByCustNo(cust_no));
    }

}
