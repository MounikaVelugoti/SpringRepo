package com.prolifics.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		 
		/*Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		restaurantObj.greetCustomer();*/
		
		//test spring lazy
		System.out.println("fetch bean B");
		context.getBean("testB");
	}
	
}
