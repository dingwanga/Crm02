package cn.bdqn.crm.client;

import cn.bdqn.crm.pojo.SysUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-provider")
public interface SysUserClient {

    @GetMapping("/userLogin")
    SysUser doLogin(
            @RequestParam(name = "userName") String userName,
            @RequestParam(name = "userPassword") String userPassword);
}
