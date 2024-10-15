package com.zhp.gulimall.gulimallmember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.zhp.gulimall.gulimallmember.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zhp.gulimall.gulimallmember.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {

        SpringApplication.run(GulimallMemberApplication.class, args);


    }

}
