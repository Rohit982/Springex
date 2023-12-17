package com.inet.demo.Empp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phno;
	private Set<String> address;
	private Map<String,String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhno() {
		return phno;
	}
	public void setPhno(List<String> phno) {
		this.phno = phno;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Emp(String name, List<String> phno, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phno = phno;
		this.address = address;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
