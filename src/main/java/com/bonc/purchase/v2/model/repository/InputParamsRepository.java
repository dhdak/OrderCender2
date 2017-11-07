package com.bonc.purchase.v2.model.repository;

import com.bonc.purchase.v2.model.entity.InputParams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InputParamsRepository extends JpaRepository<InputParams,String> {

    List<InputParams> findByInterfaceId(String interfaceId);
}
