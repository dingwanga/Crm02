package com.shanyu.controller;

import com.shanyu.pojo.SalPlan;
import com.shanyu.pojo.SalPlanParam;

import com.shanyu.service.SalPlanService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SalPlanController {
    @Autowired
    private SalPlanService salPlanService;

    @PostMapping("/salPlan")
    public RestResponse addSalPlan(@RequestBody SalPlan plan) {
        int result = salPlanService.add(plan);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.ADD_FAILURE);
        }
    }

    @DeleteMapping("/salPlan/{id}")
    public RestResponse delSalPlan(@PathVariable("id") int id) {
        int result = salPlanService.del(id);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.DEL_FAILURE);
        }
    }

    @PutMapping("/salPlan")
    public RestResponse updateSalPlan(@RequestBody SalPlan plan) {
        int result = salPlanService.update(plan);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/salPlan/{chc_id}")
    public RestResponse getSalPlanParam(@PathVariable("chc_id") int chc_id) {
        SalPlanParam param = salPlanService.getSalPlanParamByChcId(chc_id);
        if (param != null) {
            return RestResponse.success(param);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

}
