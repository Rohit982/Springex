package com.inet.demo.lifecycInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("enjoy pepsi :init");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("pepsi finish:destroy");
		// TODO Auto-generated method stub
		
	}
	
}
