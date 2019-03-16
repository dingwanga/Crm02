package com.shanyu.controller;

import com.shanyu.pojo.SalChance;
import com.shanyu.pojo.SalChanceParam;
import com.shanyu.service.SalChanceService;
import com.shanyu.service.SalPlanService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class SalChanceController {
    @Autowired
    public SalChanceService salChanceService;
    @Autowired
    public SalPlanService salPlanService;

    @PostMapping("/add")
    public RestResponse addSalChance(@RequestBody SalChance chance) {
        int result = salChanceService.add(chance);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.ADD_FAILURE);
        }
    }

    @DeleteMapping("/delSalChance/{id}")
    public RestResponse delSalChance(@PathVariable("id") int id) {
        int result = salChanceService.del(id);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.DEL_FAILURE);
        }
    }

    @PutMapping("/update")
    public RestResponse updateSalChance(@RequestBody SalChance chance) {
        int result = salChanceService.update(chance);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/list")
    public RestResponse getSalChanceList(SalChanceParam param) {
        salChanceService.setParam(param);
        return RestResponse.success(param);
    }

    @GetMapping("/list/{id}")
    public RestResponse getSalChance(@PathVariable("id") int id) {
        SalChance chance = salChanceService.getById(id);
        if (chance != null) {
            return RestResponse.success(chance);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @PutMapping("/due")
    public RestResponse dueSalChance(@RequestBody SalChance chance) {
        chance.setChc_due_date(new Date());
        chance.setChc_status(2);
        int result = salChanceService.update(chance);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @PutMapping("/stopSalChance/{id}")
    public RestResponse stopSalChance(@PathVariable("id") int id) {
        int result = salChanceService.stopSalChance(id);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @PutMapping("/developSalChance/{id}")
    public RestResponse developSalChance(@PathVariable("id") int id) {
        SalChance chance = salChanceService.getById(id);
        chance.setChc_status(3);
        int result = salChanceService.update(chance);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }
}
