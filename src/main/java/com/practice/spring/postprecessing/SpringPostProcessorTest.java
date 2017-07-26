package com.practice.spring.postprecessing;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPostProcessorTest {
	public static void main(String[] args) {        
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_post_processor.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();	      
	}
}
