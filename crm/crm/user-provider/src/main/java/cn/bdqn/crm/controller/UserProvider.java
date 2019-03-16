package cn.bdqn.crm.controller;

import cn.bdqn.crm.mapper.SysRoleMapper;
import cn.bdqn.crm.mapper.SysUserMapper;
import cn.bdqn.crm.pojo.SysRole;
import cn.bdqn.crm.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserProvider {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @GetMapping("/userLogin")
    public SysUser doLogin(
            @RequestParam(name = "userName") String userName,
            @RequestParam(name = "userPassword") String userPassword) {
        Map<String, Object> params = new HashMap<>();
        params.put("userName", userName);
        params.put("userPassword", userPassword);
        try {
            List<SysUser> list = sysUserMapper.getSysUserListByMap(params);
            if (list.size() > 0) {
                return list.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/findByRoleId")
    public SysRole findByRoleId(
            @RequestParam("roleId")
                    Integer roleId){
        SysRole role = null;
        try {
            role = sysRoleMapper.getSysRoleById(roleId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return role;
    }
}
