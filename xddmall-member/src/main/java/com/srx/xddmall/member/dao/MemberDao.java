package com.srx.xddmall.member.dao;

import com.srx.xddmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 13:30:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
