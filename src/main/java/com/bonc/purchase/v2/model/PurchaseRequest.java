/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 订购请求
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-11 11:10
 */
@Data
public class PurchaseRequest implements Serializable {
    private String key;
    private String method;
    private String tenantId;
    private String data;

    private String authKey;
    private String decryptBody;
    private String callCode;
    private String callName;

}
