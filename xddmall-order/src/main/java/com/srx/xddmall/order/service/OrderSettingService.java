package com.srx.xddmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.srx.common.utils.PageUtils;
import com.srx.xddmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 13:41:23
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

