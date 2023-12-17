package com.inet.demo.Standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/inet/demo/Standalonecollection/cconfig.xml");
	Person p1=context.getBean("p1",Person.class);
       	System.out.println(p1);
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("------------------------");
		System.out.println(p1.getFees());
		System.out.println(p1.getFees().getClass().getName());
		System.out.println("--------------------------");
		System.out.println(p1.getProperties());
		System.out.println(p1.getProperties().getClass().getName());

	}

}
