package com.springbasics.springin5steps;

import com.springbasics.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//What are the beans that spring has to manage ?
	//What are the dependencies (sort algo is a dependency of BinarySearchImpl)
	//Where to serach for the beans.

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); //Bean(new QuickSortAlgorithm()) wiring in as a dependency
		//Get the bean from the ApplicationContext
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12,3,4,1,5}, 3);
		System.out.println(result);
	}
}
