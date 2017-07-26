package com.practice.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BeanFactoryAwareImpl implements BeanFactoryAware {
    private BeanFactory beanFactory;
    
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method called");
        this.beanFactory = beanFactory;        
    }
    
    public void displayPersonDetails(){
        Person person = (Person)beanFactory.getBean("person");
        System.out.println(person.getName());        
        System.out.println(beanFactory.isSingleton("person"));
    }
}
