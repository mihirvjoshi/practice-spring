package com.practice.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareImpl implements BeanNameAware {
	private String beanName;
	
	BeanNameAwareImpl(String beanName){
		System.out.println("--Inside Constructor--");
		this.beanName=beanName;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName +" bean has been initialized." );	
	}

	public String getBeanName(){
		return beanName;
	}
}
