package com.bonc.purchase.v2.model.service;


import com.bonc.purchase.v2.model.PurchaseResponse;

import java.util.Map;

public interface OrderService {
    PurchaseResponse handle(Map productMap,String interfaecId);
}
