package com.inet.demo.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/inet/demo/spel/cconfig.xml");
	Student p1=context.getBean("student",Student.class);
       	System.out.println(p1);
       	
       	SpelExpressionParser temp = new SpelExpressionParser();
       Expression exp=temp.parseExpression("22+44");
       System.out.println(exp.getValue());
	}

}
