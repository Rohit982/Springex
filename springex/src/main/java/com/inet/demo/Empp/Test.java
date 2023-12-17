package com.inet.demo.Empp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/inet/demo/Empp/cconfig.xml");
		Emp emp=(Emp) context.getBean("emp");
		System.out.println(emp.getName());
		System.out.println(emp.getPhno());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourse());

	}

}
