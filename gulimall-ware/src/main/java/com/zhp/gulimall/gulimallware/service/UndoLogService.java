package com.zhp.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhp.gulimall.gulimallcommon.utils.PageUtils;
import com.zhp.gulimall.gulimallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 21:56:59
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

