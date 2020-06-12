package com.springbasics.springin5steps;

import com.springbasics.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

	public static void main(String[] args) {
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		LOGGER.info("{}",someCDIBusiness);
	}
}
