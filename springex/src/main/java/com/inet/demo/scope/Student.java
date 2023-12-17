package com.inet.demo.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component
@Component("stu")
//@Scope("prototype") if u use comment on these it will act as singleton scope
@Scope("prototype")
public class Student {
	@Value("rohit")
	private String Sname;
	
	@Value("hyd")
	private String city; 
    @Value("#{k}")
	private List<String> address;

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

	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
}
