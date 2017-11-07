package com.bonc.purchase.v2.model.service;

import com.bonc.purchase.v2.model.PurchaseResponse;

import java.util.Map;

/**
 * 调用联通接口服务
 *
 * @author weizh
 */
public interface UnicomService {
    PurchaseResponse handle(Map productMap, String interfaecId);
}
