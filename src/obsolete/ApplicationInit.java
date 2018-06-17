package org.prometheus.infrastructure.proxyservice.component;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * Created by JavaDeveloperZone on 27-07-2017.
 */
@Component
//@Order(value = 1)
public class ApplicationInit implements ApplicationRunner {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ApplicationInit.class);



    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        // Something to do after SpringBoot startup
    }
}