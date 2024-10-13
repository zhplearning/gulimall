package com.zhp.gulimall.gulimallproduct;

import com.zhp.gulimall.gulimallproduct.entity.BrandEntity;
import com.zhp.gulimall.gulimallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setDescript("哈哈哈");
        brandEntity.setName("小米su7");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
