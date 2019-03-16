package cn.bdqn.crm.client;

import cn.bdqn.crm.pojo.SysRole;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-provider")
public interface SysRoleClient {

    @GetMapping("/findByRoleId")
    SysRole findByRoleId(
            @RequestParam("roleId")
            Integer roleId);
}
