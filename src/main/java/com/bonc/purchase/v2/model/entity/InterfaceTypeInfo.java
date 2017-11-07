package com.bonc.purchase.v2.model.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oc_interface")
@Data
public class InterfaceTypeInfo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String name;
    private String beanName;
    private String description;
    private boolean longBus;
}
