package cn.bdqn.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //开启SpringBoot
@EnableDiscoveryClient //开启Eureka注册
@EnableFeignClients  //开启Feign
@EnableSwagger2 //开启SwaggerAPI
@EnableCaching //开启Redis缓存
public class UserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }

}

