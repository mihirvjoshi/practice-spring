package com.practice.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeMethod implements MethodBeforeAdvice {
	
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {	
		
		System.out.println("Logging Starts For " + arg0.getDeclaringClass() 
				+ " method " + arg0.getName());
	}

}
