package com.shanyu.controller;

import com.shanyu.pojo.SysUser;
import com.shanyu.service.UserService;
import com.shanyu.util.RestCode;
import com.shanyu.util.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService us;

    @GetMapping("/listbyrole/{id}")
    public RestResponse getByRole(@PathVariable("id") int role_id) {
        List<SysUser> list = us.getByRole(role_id);
        if (list != null) {
            return RestResponse.success(list);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @GetMapping("/accountManagers")
    public RestResponse getAccountManagers() {
        List<SysUser> managers = us.getByRole(3);
        if (managers != null) {
            return RestResponse.success(managers);
        } else {
            return RestResponse.error(RestCode.ID_INVALID);
        }
    }

    @PostMapping("/login")
    public RestResponse login(@RequestBody SysUser user) {
        SysUser duser = us.login(user.getUsr_name(), user.getUsr_password());
        if (duser != null) {
            return RestResponse.success(duser);
        } else {
            return RestResponse.error(RestCode.LOGIN_ERROR);
        }
    }

    @GetMapping("/getUser")
    public RestResponse getUser(String token) {
        SysUser user = us.getByToken(token);
        if (user != null) {
            return RestResponse.success(user);
        } else {
            return RestResponse.error(RestCode.TOKEN_INVALID);
        }
    }
}
