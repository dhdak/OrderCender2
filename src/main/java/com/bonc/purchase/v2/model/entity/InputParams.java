package com.bonc.purchase.v2.model.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 接口业务入参
 */
@Entity
@Table(name="oc_in_params")
@Data
public class InputParams {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;
    String interfaceId;//联通接口id
    String type;
    String name; //订购产品接口所需要的参数
    String productParam; //productMap中的参数
    String parentParam;
    boolean external;
    String serviceName;
}
