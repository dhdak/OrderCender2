package com.bonc.purchase.v2.model.service;

import com.bonc.purchase.v2.Application;
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

}