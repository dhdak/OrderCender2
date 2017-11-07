/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model;

import com.bonc.purchase.v2.model.type.SystemCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 订购响应
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-11 15:07
 */
@AllArgsConstructor
@Data
public class PurchaseResponse implements Serializable {
    private String code;
    private String msg;

    public static PurchaseResponse of(SystemCodeEnum systemCodeEnum){
        return new PurchaseResponse(systemCodeEnum.getCode(),systemCodeEnum.getMessage());
    }

}
