package com.srx.xddmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.srx.common.utils.PageUtils;
import com.srx.xddmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 13:49:57
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

