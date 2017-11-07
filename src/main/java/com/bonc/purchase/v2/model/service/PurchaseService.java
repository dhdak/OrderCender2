package com.bonc.purchase.v2.model.service;


import com.bonc.purchase.v2.model.PurchaseResponse;
import com.bonc.purchase.v2.model.dto.ProductDto;
import com.bonc.purchase.v2.model.entity.InterfaceProductRelate;
import com.bonc.purchase.v2.model.entity.InterfaceTypeInfo;
import com.bonc.purchase.v2.model.repository.InterfaceProductRelateRepository;
import com.bonc.purchase.v2.model.service.impl.OrderFlowFor4GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PurchaseService {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    InterfaceProductRelateRepository interfaceProductRelateRepository;

    public PurchaseResponse purchase(ProductDto dto){
        Map<String, Object> map = null;
        try {
            map = BeanFlattener.deepToMap(dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        InterfaceTypeInfo interfaceInfo = getInterfaceInfo((String) map.get("products.interfaceProductId"));
        String beanName = interfaceInfo.getBeanName();
        OrderService service = (OrderService)applicationContext.getBean(interfaceInfo.getBeanName());
        service.handle(map);

        return null;
    }


    /**
     * 根据产品id查询接口
     *
     * @param productId
     * @return
     */
    public InterfaceTypeInfo getInterfaceInfo(String productId) {
        InterfaceProductRelate productRelate = interfaceProductRelateRepository.findByProductId(productId);
        if(productRelate==null){

        }
        return productRelate.getInterfaceTypeInfol();
    }

}
