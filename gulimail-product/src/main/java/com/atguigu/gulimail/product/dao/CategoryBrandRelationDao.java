package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author wanghewen
 * @email wanghewen@gmail.com
 * @date 2024-07-24 22:14:24
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
