package com.shanyu.mapper;


import com.shanyu.pojo.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT u.`usr_id`,u.`usr_name`,u.`usr_password`,u.`usr_role_id`,u.`usr_flag` " +
            "FROM sys_user u WHERE u.`usr_flag`=1 AND u.`usr_role_id`=#{id}")
    public List<SysUser> getByRole(@Param("id") int role_id);

    /**
     * 根据用户名和密码查询用户
     *
     * @param usr_name     - 用户名
     * @param usr_password - 密码
     * @return 所得的用户
     */
    @Select("SELECT u.`usr_id`,u.`usr_name`,u.`usr_password`,u.`usr_role_id`,u.`usr_flag`,r.`role_name` " +
            "FROM sys_user u LEFT JOIN sys_role r ON u.`usr_role_id`=r.`role_id` " +
            "WHERE u.`usr_name`=#{usr_name} AND u.`usr_password`=#{usr_password} AND u.`usr_flag`=1")
    public SysUser getByNamePwd(@Param("usr_name") String usr_name, @Param("usr_password") String usr_password);

}
