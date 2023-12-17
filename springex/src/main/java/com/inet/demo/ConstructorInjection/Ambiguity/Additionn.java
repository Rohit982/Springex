package com.inet.demo.ConstructorInjection.Ambiguity;

public class Additionn {
	
	private int a;
	private int b;
	
	public Additionn(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Construtor int,int");
	}
	public Additionn(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Construtor String,String");
	}
	public Additionn(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Construtor double,double");
	}
	
	public void dosum() {
		System.out.println("value of a="+this.a+" value of b="+this.b);
		System.out.println("sum is:"+(this.a+this.b));
	}

}
