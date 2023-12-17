package com.inet.demo.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/inet/demo/scope/cconfig.xml");
	    Student p1=context.getBean("stu",Student.class);
       	System.out.println("p1 hashcode= "+p1.hashCode());
       	Student p2=context.getBean("stu",Student.class);
       	System.out.println("p2 hash code="+p2.hashCode());
       	 Teacher t1=context.getBean("tea",Teacher.class);
       	Teacher t2=context.getBean("tea",Teacher.class);
       	System.out.println("t1 hash code="+t1.hashCode());
       	System.out.println("t2 hash code="+t2.hashCode());

	}

}
