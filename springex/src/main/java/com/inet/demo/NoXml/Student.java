package com.inet.demo.NoXml;

//import org.springframework.stereotype.Component;

//@Component("ob") these is use when @Bean is not there
public class Student {
	
	private Samosa samosa;
	
	public void study() {
		System.out.println("student is studying");
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
     
}
