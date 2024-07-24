package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wanghewen
 * @email wanghewen@gmail.com
 * @date 2024-07-24 23:40:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
