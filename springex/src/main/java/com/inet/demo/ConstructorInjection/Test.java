package com.inet.demo.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/inet/demo/ConstructorInjection/ciconfig.xml");
		Person p1= context.getBean("p1",Person.class);
		System.out.println(p1);

	}

}
