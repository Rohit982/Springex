package com.inet.demo.ConstructorInjection.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/inet/demo/ConstructorInjection/Ambiguity/ciconfig.xml");
		Person p1= context.getBean("p1",Person.class);
		System.out.println(p1);
                  Additionn add = context.getBean("add",Additionn.class);
                  add.dosum();
	}

}
