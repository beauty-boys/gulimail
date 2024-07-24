package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author wanghewen
 * @email wanghewen@gmail.com
 * @date 2024-07-24 23:40:25
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
