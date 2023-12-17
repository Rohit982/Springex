package com.inet.demo.Sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/inet/demo/Sterotype/cconfig.xml");
	Student p1=context.getBean("stu",Student.class);
       	System.out.println(p1);

	}

}
