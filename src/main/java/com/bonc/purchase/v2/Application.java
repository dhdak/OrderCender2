/**
 * Copyright (c) 2017 www.bonc.com.cn. All Rights Reserved.
 */
package com.bonc.purchase.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 描述当前功能
 * </p>
 *
 * @author yangwang1@bonc.com.cn
 * @version V1.0.0
 * @date 2017-09-11 10:25
 */
@SpringBootApplication
//@EnableSimpleJpaRepositories(basePackages = "com.bonc.icrm.purchase.**.repository")
//@EntityScan(basePackages = "com.bonc.icrm.purchase.**.entity")
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}





































