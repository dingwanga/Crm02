package cn.bdqn.crm.service;

import cn.bdqn.crm.client.SysRoleClient;
import cn.bdqn.crm.client.SysUserClient;
import cn.bdqn.crm.pojo.SysRole;
import cn.bdqn.crm.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserClient userClient;
    @Autowired
    private SysRoleClient sysRoleClient;

    @Override
    public SysUser doLogin(String userName, String userPassword) {
        return userClient.doLogin(userName, userPassword);
    }

    @Override
    public SysRole findRoleById(Integer userRoleId) {
        return sysRoleClient.findByRoleId(userRoleId);
    }
}
