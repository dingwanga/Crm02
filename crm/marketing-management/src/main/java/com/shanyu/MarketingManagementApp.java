package com.shanyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.shanyu.mapper")
public class MarketingManagementApp {
    public static void main(String[] args) {
        SpringApplication.run(MarketingManagementApp.class, args);
    }
}
