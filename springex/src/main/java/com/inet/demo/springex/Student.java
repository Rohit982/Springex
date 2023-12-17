package com.inet.demo.springex;

public class Student {
	private int Sid;
	private String Sname;
	private String add;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Student(int sid, String sname, String add) {
		super();
		Sid = sid;
		Sname = sname;
		this.add = add;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", add=" + add + "]";
	}
	

}
