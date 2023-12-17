package com.inet.demo.lifecycInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
	 context = new ClassPathXmlApplicationContext("com/inet/demo/lifecycInterface/config.xml");
	 Pepsi p1=(Pepsi) context.getBean("p");
	 System.out.println(p1);
	 context.registerShutdownHook();

	}

}
