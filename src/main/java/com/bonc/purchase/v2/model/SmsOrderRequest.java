/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model;

import lombok.Data;

/**
 * <p>
 * 描述当前功能
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-26 15:56
 */
@Data
public class SmsOrderRequest {

    private String mobile;
    private String orderFlag;
    private String operator;
    private String channelId;

}
