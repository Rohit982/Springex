package com.inet.demo.lifecyc;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("these is samosa");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("init method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}

}
