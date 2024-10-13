package com.zhp.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhp.gulimall.gulimallcommon.utils.PageUtils;
import com.zhp.gulimall.gulimallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author zhanhuiping
 * @email zhplearning@163.com
 * @date 2024-10-13 18:43:38
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

