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
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 描述当前功能
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-12 16:40
 */
@Data

public class Product implements Serializable {

    private String id;
    private String boncProductId;
    private String elementId;
    //    private String payMode;    //付费方式   01后付费 02预付费
    private String sourceFlag;
    private String payMode;
    private String sapId;    //SAP编码
    private String sapName;    //SAP名称
    private String productId;    //产品编码
    private String productName;//	产品名称
    private String packageId;    //包编码
    private String packageName;    //包名称
    private String elementName;//	资费名称
    private String productPrice;    //产品价格

    private Date startDate;    //产品开始时间

    private Date endDate;    //产品结束时间
    private String productType;    //产品大类（省内、国内、国际）
    private String productSubType;//	产品子类（假日包、日报、月包、闲时包、等）
//    private String sourceFlag;    //01 BSS 02 CBSS
    private String productMode;//	00 主产品 01 附属产品
    private String interfaceProductId;//	调用接口时使用的产品ID
    private String isOrder;    //是否能订购，1能，0不能
    private Integer orderOrd;    //订购顺序
    private String boncProductName;//SAP编码、后付费、预付费编码封装的统一编码名称
    private String takeEffectType;//产品生效方式，NOW 、NEXTMONTH
    private String isWhile;//失败后是否使用下一个编码订购
    private String tenantId;//租户id
    private String productRst1;//接口类型（1流量包，2承诺低消，3增值业务）

}
