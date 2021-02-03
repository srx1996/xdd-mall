package com.srx.xddmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.srx.common.utils.PageUtils;
import com.srx.xddmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 10:56:47
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

