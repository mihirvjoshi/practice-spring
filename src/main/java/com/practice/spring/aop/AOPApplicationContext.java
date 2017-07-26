package com.practice.spring.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class AOPApplicationContext {
	
	static ApplicationContext appContext = new ClassPathXmlApplicationContext(
			new String[] { "Spring-AOP-Example.xml" });

	
	public static void main(String[] args) {
		returnCustomerService(); 
		System.out.println("==================================================================================");
		returnCustomerServiceProxy();
	}

	private static void returnCustomerService() {
		CustomerService cust = (CustomerService) appContext.getBean("customerService"); 
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
//		try {
//			cust.printThrowException();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	private static void returnCustomerServiceProxy() {
		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy"); 
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
	}

}