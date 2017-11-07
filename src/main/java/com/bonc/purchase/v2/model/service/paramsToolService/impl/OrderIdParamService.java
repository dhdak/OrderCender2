package com.bonc.purchase.v2.model.service.paramsToolService.impl;

import com.bonc.purchase.v2.model.service.paramsToolService.ParamsToolService;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Service
public class OrderIdParamService implements ParamsToolService {

    @Override
    public String handle(Map productMap){
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateStr = df.format(new Date());
        String orderId = productMap.get("userInfoDto.mobile")+"_"+dateStr;
        return orderId;
    }
}
