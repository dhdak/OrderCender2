package com.bonc.purchase.v2.model.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flowable_interface")
@Data
public class FlowableInterfaceInfo {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;
    String processId;
    String name;
    String beanName;
    String funName;
    String interfaceId;
}
