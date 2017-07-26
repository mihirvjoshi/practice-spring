package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.practice.spring.thread.PrintTask;

public class AppWithConfigXmlTest {
    
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Config.xml");

		ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) context
				.getBean("taskExecutor");
		
		taskExecutor.execute(new PrintTask("Thread 1"));
		taskExecutor.execute(new PrintTask("Thread 2"));
		taskExecutor.execute(new PrintTask("Thread 3"));
		taskExecutor.execute(new PrintTask("Thread 4"));
		taskExecutor.execute(new PrintTask("Thread 5"));

		// check active thread, if no then shut down the thread pool
		for (;;) {
			int count = taskExecutor.getActiveCount();
			System.out.println("Active Threads : " + count);
			try {
			    Thread.sleep(1000);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			if (count == 0) {
			    taskExecutor.shutdown();
			    break;
			}
		}
		
		
	}
}
