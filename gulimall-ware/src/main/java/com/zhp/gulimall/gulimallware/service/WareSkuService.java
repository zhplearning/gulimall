package com.zhp.gulimall.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhp.gulimall.gulimallcommon.utils.PageUtils;
import com.zhp.gulimall.gulimallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 21:56:59
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

