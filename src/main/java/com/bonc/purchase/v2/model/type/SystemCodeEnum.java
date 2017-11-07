/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2.model.type;

/**
 * <p>
 * 描述当前功能
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-11 15:50
 */
public enum  SystemCodeEnum {

    NO_OPERATOR_PERMISSION("-1","没有访问权限"),
    NO_SUCH_METHOD("-3","暂不支持此类业务订购"),
    SYSTEM_ERROR("-99","系统错误"),
    CODE_SUCCESS("000000","成功"),
    CODE_FAIL("000001","错误的请求数据"),
    USER_NULL("000005","用户不存在"),
    OPERATOR_NULL("000006","操作员不存在"),
    PRODUCT_NULL("000007","没有此类产品"),
    HAVE_DIXIAO("000008","已订购该低消产品"),
    ORDER_FAIL("000009","订购失败："),
    PRE_ORDER_FILE("000010","预提交低消订购失败："),
    PHONE_ERROR("000011","手机号码错误");


    private String code;
    private String message;

    SystemCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
