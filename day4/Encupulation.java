package com.day4;

//Sensitive data is hidden from users
//Using getters and setters we can access

public class Encupulation {
	
	private int a;
	private String name;
	
	//setters method 
	public int getA() {
		return a;
	}
	
	//getters method
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
