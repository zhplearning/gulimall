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
        brandEntity.setDescript("汽车企业的新秀");
        brandEntity.setName("小米su7");
        brandEntity.setLogo("pro");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
