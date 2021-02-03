package com.srx.xddmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.srx.common.utils.PageUtils;
import com.srx.xddmall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 10:56:47
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

