package com.zhp.gulimall.gulimallcoupon.dao;

import com.zhp.gulimall.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 19:26:15
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
