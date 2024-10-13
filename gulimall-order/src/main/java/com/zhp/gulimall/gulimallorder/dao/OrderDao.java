package com.zhp.gulimall.gulimallorder.dao;

import com.zhp.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 21:44:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
