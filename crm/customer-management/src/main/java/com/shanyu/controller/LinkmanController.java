package com.shanyu.controller;

import com.shanyu.pojo.Linkman;
import com.shanyu.service.LinkmanService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LinkmanController {
    @Autowired
    private LinkmanService linkmanService;

    @PostMapping("/linkman")
    public RestResponse addLinkman(@RequestBody Linkman linkman) {
        int result = linkmanService.add(linkman);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.ADD_FAILURE);
        }
    }

    @DeleteMapping("/linkman/{id}")
    public RestResponse delLinkman(@PathVariable("id") int id) {
        int result = linkmanService.del(id);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.DEL_FAILURE);
        }
    }

    @PutMapping("/linkman")
    public RestResponse updateLinkman(@RequestBody Linkman linkman) {
        int result = linkmanService.update(linkman);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/linkmanlist/{cust_no}")
    public RestResponse getAll(@PathVariable("cust_no") String cust_no) {
        return RestResponse.success(linkmanService.getByCustNo(cust_no));
    }

    @GetMapping("/linkman/{id}")
    public RestResponse getLinkmanById(@PathVariable("id") int id) {
        Linkman linkman = linkmanService.getById(id);
        if (linkman != null) {
            return RestResponse.success(linkman);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }
}
