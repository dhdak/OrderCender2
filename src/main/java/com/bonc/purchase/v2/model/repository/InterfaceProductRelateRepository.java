package com.bonc.purchase.v2.model.repository;

import com.bonc.purchase.v2.model.entity.InterfaceProductRelate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceProductRelateRepository extends JpaRepository<InterfaceProductRelate,String> {

    InterfaceProductRelate findByProductId(String productId);

}
