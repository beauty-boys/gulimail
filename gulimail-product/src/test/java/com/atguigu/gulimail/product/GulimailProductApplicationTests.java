package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("小米");
        brandService.updateById(brandEntity);
        System.out.println("保存成功....");
    }

}
