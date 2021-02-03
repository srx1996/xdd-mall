package com.srx.xddmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XddmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(XddmallCouponApplication.class, args);
    }

}
