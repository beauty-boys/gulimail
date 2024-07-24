package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author wanghewen
 * @email wanghewen@gmail.com
 * @date 2024-07-24 23:27:29
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
