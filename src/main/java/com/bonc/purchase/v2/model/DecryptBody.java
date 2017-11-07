package com.bonc.purchase.v2.model;

import lombok.Data;

/**
 * 解密后请求data部分参数
 */

@Data
public class DecryptBody {

    String phoneNumber;
    String transactionId;
    String boncProductId;
    String operatorId;
    String externalChannel;
}
