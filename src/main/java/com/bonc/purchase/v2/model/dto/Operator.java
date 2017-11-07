/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model.dto;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * 操作员 表
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-13 17:24
 */
@Data

public class Operator {

    private String id;
    private String tenantId;
    private String externalChannel;// 接入的外部渠道。 比如 华为， 沃视窗， 弹窗
    private String bizType; //业务类别 流量包， 增值业务， 低消
    private String netType; //网络类别 4G， 23G
    private String cityCode;// 城市编码
    private String provinceCode; // 省份编码
    private String callCode;
    private String operatorId; // 操作员编码
    private String channelId;
    private String channelType;

    public Operator() {
    }

    public Operator(String operatorId) {
        this.operatorId = operatorId;
    }
}
