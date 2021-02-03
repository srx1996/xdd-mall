package com.srx.xddmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.srx.common.utils.PageUtils;
import com.srx.xddmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 13:21:26
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

