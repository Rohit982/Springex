package com.inet.demo.auto.wireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp{
	@Autowired
	@Qualifier("address1")
	/*This annotation may be used on a field or parameter as a qualifier forcandidate beans when autowiring. 
	It may also be used to annotate othercustom annotations that can then in turn be used as qualifiers */
	private Address address;
    
	public Emp(Address address) {
    	System.out.println("this is constructor");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("this is setter");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
