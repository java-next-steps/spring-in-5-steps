package com.springbasics.springin5steps;

import com.springbasics.properties.SomeExternalService;
import com.springbasics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springbasics.properties")
@PropertySource("app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);

		SomeExternalService externalService = applicationContext.getBean(SomeExternalService.class);
		System.out.println(externalService.returnServiceURL());
		applicationContext.close();
	}
}
