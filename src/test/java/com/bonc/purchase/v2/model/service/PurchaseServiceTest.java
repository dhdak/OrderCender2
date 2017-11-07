package com.bonc.purchase.v2.model.service;

import com.bonc.purchase.v2.Application;
import com.bonc.purchase.v2.model.dto.Operator;
import com.bonc.purchase.v2.model.dto.Product;
import com.bonc.purchase.v2.model.dto.ProductDto;
import com.bonc.purchase.v2.model.dto.UserInfoDto;
import com.bonc.purchase.v2.model.entity.InterfaceTypeInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class PurchaseServiceTest {

    @Autowired
    PurchaseService purchaseService;

    @Test
    public void testGetInterfaceInfo(){
        InterfaceTypeInfo interfaceInfo = purchaseService.getInterfaceInfo("1");
        System.out.println(interfaceInfo);
    }

    @Test
    public void testPurchase(){
        ProductDto dto = new ProductDto();
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setPayMode("1");
        userInfoDto.setMobile("18503350583");
        userInfoDto.setCityCode("10010");

        Operator operator = new Operator("123");

        Product product = new Product();
        product.setElementId("123");
        product.setInterfaceProductId("1");

        dto.setProduct(product);
        dto.setUserInfoDto(userInfoDto);
        dto.setOperator(operator);

        purchaseService.purchase(dto);

    }

}