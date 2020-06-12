package com.springbasics.springin5steps;

import com.springbasics.springin5steps.basic.BinarySearchImpl;
import com.springbasics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
    }
}
