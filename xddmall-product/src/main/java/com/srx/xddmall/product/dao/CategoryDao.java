package com.srx.xddmall.product.dao;

import com.srx.xddmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 10:56:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
