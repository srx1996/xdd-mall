package com.srx.xddmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.srx.common.utils.PageUtils;
import com.srx.xddmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 13:41:23
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

