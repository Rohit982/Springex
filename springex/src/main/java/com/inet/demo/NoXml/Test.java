package com.inet.demo.NoXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student stu = context.getBean("student",Student.class);
		System.out.println(stu);
		stu.study();
		stu.getSamosa().display();
		

	}

}
