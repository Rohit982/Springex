package com.inet.demo.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("rohit")
	private String Sname;
	
	@Value("hyd")
	private String city; 
	
    @Value("#{k}")/* these expression language  is for reference*/
	private List<String> address;
    
    @Value("#{5>9?55:99}")/*these expression is for ternary expression*/
    //@Value("#{11+22}") /* these expression is for  operator*/
    private int y;
    //private int x;
    
    @Value("#{T(java.lang.Math).sqrt(144)}")/* these expression is for staticClass.method*/
    private double a;
    
    @Value("#{T(java.lang.Math).PI}")/*these expression is for  staticClass.variable*/
    private double b;
    
    @Value("#{new java.lang.String('Rohit')}")/*these expression is for object*/
    private String name;
    
    @Value("#{5>2}")/*these expression is for boolean*/
    private boolean isactive; 
    
	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", city=" + city + ", address=" + address + ",  y=" + y + ", a="
				+ a + ", b=" + b + ", name=" + name + ", isactive=" + isactive + "]";
	}
    	
}
