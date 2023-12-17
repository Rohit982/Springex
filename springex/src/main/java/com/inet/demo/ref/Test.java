package com.inet.demo.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/inet/demo/ref/refconfig.xml");
		A temp=(A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp);

	}

}
