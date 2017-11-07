package com.bonc.purchase.v2.model.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unicom_interface")
@Data
public class UnicomInterfaceInfo {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;
    String name;
    String url;
    String interfaceId;
}
