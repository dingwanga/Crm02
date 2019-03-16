package com.shanyu.service;

import com.shanyu.pojo.SysUser;

import java.util.List;

public interface UserService {

    /**
     * 根据角色编号获取用户
     *
     * @param role_id - 角色编号
     * @return 获取的用户集合
     */
    public List<SysUser> getByRole(int role_id);

    /**
     * 根据用户名密码获取用户
     *
     * @param username - 用户名
     * @param password - 密码
     * @return 获取得到的用户
     */
    public SysUser getByNamePwd(String username, String password);

    /**
     * 用户登录
     *
     * @param username - 用户名
     * @param password - 密码
     * @return 登陆成功的用户，失败返回null
     */
    public SysUser login(String username, String password);

    /**
     * 根据token获取用户信息
     *
     * @param token - token字符串
     * @return 所得的用户
     */
    public SysUser getByToken(String token);
}
