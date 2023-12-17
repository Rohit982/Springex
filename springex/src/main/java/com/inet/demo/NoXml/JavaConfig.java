package com.inet.demo.NoXml;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.inet.demo.NoXml") these is use when @Bean is not there
public class JavaConfig {
	
	@Bean                 
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp"})
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}

}
