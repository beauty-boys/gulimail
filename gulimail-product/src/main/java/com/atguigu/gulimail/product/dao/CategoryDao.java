package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wanghewen
 * @email wanghewen@gmail.com
 * @date 2024-07-24 22:14:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
