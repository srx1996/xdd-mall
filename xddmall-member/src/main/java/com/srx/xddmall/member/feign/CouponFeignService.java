package com.srx.xddmall.member.feign;

import com.srx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("xddmall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/memberCoupons/list")
    R memberCoupons();
}
