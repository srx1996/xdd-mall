package com.srx.xddmall.order.dao;

import com.srx.xddmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 13:41:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
