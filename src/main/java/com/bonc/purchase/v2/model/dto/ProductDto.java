/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 描述当前功能
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-12 11:58
 */
@Data
public class ProductDto implements Serializable {

    //订购人信息
    private UserInfoDto userInfoDto;
    //操作人信息
    public Operator operator;
    //订购的产品
    private Product products;

    public ProductDto() {
    }

    public ProductDto(UserInfoDto userInfoDto, Operator operator, Product products) {
        this.userInfoDto = userInfoDto;
        this.operator = operator;
        this.products = products;
    }
}
