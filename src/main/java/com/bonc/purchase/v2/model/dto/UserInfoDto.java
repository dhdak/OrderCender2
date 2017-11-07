/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-13 09:14
 */
@Data
public class UserInfoDto implements Serializable {

    public static final String NET_TYPE_4G = "4G";
    public static final String NET_TYPE_23G = "23G";

    private String provinceCode;
    private String cityCode;
    private String district;//从 BeanUserAllInfo 中获取 a24
//    private String areaNo;
    private String mobile;// 手机号码
//    private String channelId;
//    private String identityId;
//    private String identityType;
    private String payMode; // 付费类型。 预付费 1 ； 后付费 0；
//    private String openMode;
//    private String saleMode;
//    private String userType;
//    private String custId;
//    private String custName;
    private String netType;//网络类型, 判断是否4G 用户

}
