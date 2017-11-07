package com.bonc.purchase.v2.model.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="oc_interface_product")
@Data
public class InterfaceProductRelate {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
//    @Column(name="interface_id")
//    private String interfaceId;
    private String productId;
    private String productType;
    private String channelId;
    @ManyToOne
    @JoinColumn(name="interface_id")
    private InterfaceTypeInfo interfaceTypeInfol;


}
