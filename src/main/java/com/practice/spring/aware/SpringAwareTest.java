package com.practice.spring.aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAwareTest {
	public static void main(String[] args) {        
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("./beans_aware.xml");
        ApplicationContextAwareImpl applicationContextAwareImpl = (ApplicationContextAwareImpl) applicationContext.getBean("applicationContextAware");
        System.out.println("Application context aware output");
        applicationContextAwareImpl.displayPersonDetails();
        
        BeanFactoryAwareImpl beanFactoryAwareImpl = (BeanFactoryAwareImpl) applicationContext.getBean("beanFactoryAware");
        System.out.println("Bean factory aware output");
        beanFactoryAwareImpl.displayPersonDetails();
        
        BeanNameAwareImpl beanNameAware=(BeanNameAwareImpl) applicationContext.getBean("beanNameAware");
        System.out.println("Bean Name " + beanNameAware.getBeanName());
        applicationContext.registerShutdownHook();
	}
}
