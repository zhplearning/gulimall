package com.zhp.gulimall.gulimallmember.feign;

import com.zhp.gulimall.gulimallcommon.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: CouponFeignService
 * Package: com.zhp.gulimall.gulimallmember.feign
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/10/14 15:08
 * @Version 1.0
 */
@FeignClient("gulimall-coupon") //告诉spring cloud这个接口是一个远程客户端，要调用coupon服务(nacos中找到)，具体是调用coupon服务的/coupon/coupon/member/list对应的方法
public interface CouponFeignService {
    // 远程服务的url
    @RequestMapping("/gulimallcoupon/coupon/member/list")//注意写全优惠券类上还有映射//注意我们这个地方不是控制层，所以这个请求映射请求的不是我们服务器上的东西，而是nacos注册中心的
    public R memberCoupon();//得到一个R对象
}

