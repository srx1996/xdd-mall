package com.srx.xddmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.srx.xddmall.product.dao")
@EnableDiscoveryClient
public class XddmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XddmallProductApplication.class, args);
    }

}
