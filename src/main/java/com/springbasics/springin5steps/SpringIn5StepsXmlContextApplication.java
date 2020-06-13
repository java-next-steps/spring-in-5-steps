package com.springbasics.springin5steps;

import com.springbasics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext classPathXmlApplicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}",xmlPersonDAO);
		}
	}
}
