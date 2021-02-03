package com.srx.xddmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.srx.xddmall.member.feign")
public class XddmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XddmallMemberApplication.class, args);
    }

}
