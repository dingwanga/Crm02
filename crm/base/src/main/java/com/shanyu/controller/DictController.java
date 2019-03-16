package com.shanyu.controller;

import com.shanyu.pojo.Dict;
import com.shanyu.pojo.DictParam;
import com.shanyu.service.DictService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DictController {
    @Autowired
    private DictService dictService;

    @PostMapping("/dict")
    public RestResponse addDict(@RequestBody Dict dict) {
        int result = dictService.add(dict);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.ADD_FAILURE);
        }
    }

    @DeleteMapping("/dict/{id}")
    public RestResponse delDict(@PathVariable("id") int id) {
        int result = dictService.del(id);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.DEL_FAILURE);
        }
    }

    @PutMapping("/dict")
    public RestResponse updateDict(@RequestBody Dict dict) {
        int result = dictService.update(dict);
        if (result > 0) {
            return RestResponse.success(result);
        } else {
            return RestResponse.error(RestCode.UPDATE_FAILURE);
        }
    }

    @GetMapping("/dict/{id}")
    public RestResponse getDictById(@PathVariable("id") int id) {
        Dict dict = dictService.getById(id);
        if (dict != null) {
            return RestResponse.success(dict);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/dicts")
    public RestResponse getDicts(DictParam param) {
        dictService.setParam(param);
        return RestResponse.success(param);
    }

    @GetMapping("/regionList")
    public RestResponse getRegionList() {
        return RestResponse.success(dictService.getRegionList());
    }

    @GetMapping("/levelList")
    public RestResponse getLevelList() {
        return RestResponse.success(dictService.getLevelList());
    }
}
