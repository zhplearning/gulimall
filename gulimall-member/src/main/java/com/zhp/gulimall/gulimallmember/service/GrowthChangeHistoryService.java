package com.zhp.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhp.gulimall.gulimallcommon.utils.PageUtils;
import com.zhp.gulimall.gulimallmember.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 21:25:48
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

