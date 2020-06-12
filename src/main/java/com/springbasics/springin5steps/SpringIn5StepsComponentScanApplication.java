package com.springbasics.springin5steps;

import com.springbasics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.springbasics.componentscan")
@SpringBootApplication
public class SpringIn5StepsComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
    }
}
