package cn.bdqn.crm.client;

import cn.bdqn.crm.pojo.BasDict;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "user-provider")
@RequestMapping("/basd")
public interface BasDictClient {

    @GetMapping("/findAll")
    List<BasDict> findAll();

    @PostMapping("/getTotalCountByMap")
    Integer getTotalCountByMap(@RequestBody Map<String, Object> mapCondition);

    @PostMapping("/findByPageList")
    List<BasDict> findByPage(@RequestBody Map<String, Object> mapCondition);
}
