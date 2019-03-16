package com.shanyu.service.impl;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.shanyu.mapper.UserMapper;
import com.shanyu.pojo.SysUser;
import com.shanyu.service.UserService;
import com.shanyu.util.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public List<SysUser> getByRole(int role_id) {
        return um.getByRole(role_id);
    }

    @Override
    public SysUser getByNamePwd(String username, String password) {
        return um.getByNamePwd(username, password);
    }

    @Override
    public SysUser login(String username, String password) {
        SysUser user = um.getByNamePwd(username, password);
        if (user != null) {
            //生成token
            String token = JwtHelper.genToken(ImmutableMap.of("name", user.getUsr_name(), "pwd", user.getUsr_password(), "ts", Instant.now().getEpochSecond() + ""));
            redisTemplate.opsForValue().set(user.getUsr_name(), token);
            redisTemplate.expire(user.getUsr_name(), 30, TimeUnit.DAYS);
            user.setToken(token);
        }
        return user;
    }

    @Override
    public SysUser getByToken(String token) {
        if (!Strings.isNullOrEmpty(token)) {
            Map<String, String> map = JwtHelper.verifyToken(token);
            String username = map.get("name");
            String password = map.get("pwd");
            Long expire = redisTemplate.getExpire(username);
            if (expire > 0L) {
                SysUser user = um.getByNamePwd(username, password);
                //redisTemplate.opsForValue().set(username,token);
                redisTemplate.expire(username, 30, TimeUnit.DAYS);
                return user;
            }
        }
        return null;
    }
}
