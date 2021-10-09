package com.xwx.springcloud.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableFeignClients(basePackages = "com.xwx.springcloud.api.proxy") 这是调用其他的微服务
@ComponentScan({"com.xwx.springcloud"})
@MapperScan("com.xwx.springcloud.core.dao")
@EnableDiscoveryClient
public class BizApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class);
    }
}
