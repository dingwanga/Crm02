package cn.bdqn.crm.service;

import cn.bdqn.crm.pojo.SysRole;
import cn.bdqn.crm.pojo.SysUser;

public interface UserService {

    public SysUser doLogin(String userName, String userPassword);

    SysRole findRoleById(Integer userRoleId);
}
