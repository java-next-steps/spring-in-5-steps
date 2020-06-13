package com.springbasics.springin5steps;

import com.springbasics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		//SpringBoot Style
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

		try(ClassPathXmlApplicationContext classPathXmlApplicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans loaded: {}",(Object)classPathXmlApplicationContext.getBeanDefinitionNames());
			XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}",xmlPersonDAO);
		}
	}
}

//Beans loaded: [componentDAO, scopedTarget.componentJdbcConnection, componentJdbcConnection,
// springIn5StepsBasicApplication, springIn5StepsCDIApplication, springIn5StepsComponentScanApplication,
// springIn5StepsScopeApplication, binarySearchImpl, bubbleSortAlgorithm, quickSortAlgorithm, someCDIBusiness,
// someCDIDAO, scopedTarget.jdbcConnection, jdbcConnection, personDAO,
// org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
// org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
// org.springframework.context.annotation.internalCommonAnnotationProcessor,
// org.springframework.context.event.internalEventListenerProcessor,
// org.springframework.context.event.internalEventListenerFactory,
// xmlJdbcConnection, xmlPersonDAO]
