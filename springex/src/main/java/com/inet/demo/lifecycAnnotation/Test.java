package com.inet.demo.lifecycAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
	 context = new ClassPathXmlApplicationContext("com/inet/demo/lifecycAnnotation/config.xml");
	 Example s1= (Example) context.getBean("s");
	 System.out.println(s1);
	 context.registerShutdownHook();

	}

}
