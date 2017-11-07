package com.bonc.purchase.v2.model.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 联通接口固定入参
 */

@Entity
@Table(name="unicom_in_params")
@Data
public class UnionParams {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String interfaceId;
    private String type;
    private String neme;
    private boolean external;
    private String defultValue;

}
