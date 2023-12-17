package com.inet.demo.lifecyc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
	 context = new ClassPathXmlApplicationContext("com/inet/demo/lifecyc/config.xml");
	 Samosa s1=(Samosa) context.getBean("s");
	 System.out.println(s1);
	 context.registerShutdownHook();

	}

}
