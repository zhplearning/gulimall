package com.zhp.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhp.gulimall.gulimallcommon.utils.PageUtils;
import com.zhp.gulimall.gulimallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 21:25:48
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

