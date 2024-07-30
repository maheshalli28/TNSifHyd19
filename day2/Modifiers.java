package com.day2;

//Access Modifiers - controls the access level(public, private, defualt, protected )
//Non-Access Modifiers - do not control access level, but provides other functionality


public class Modifiers {
    public int a=10;  //access for all class 
	private int b=12; //access with in the class
	int c=15;         //access with in the package 
	protected int d=20; //access with in the same pakage and subclass
			
	 public static void main(String[] args) {
				Modifiers obj = new Modifiers();
				System.out.println(obj.a);
				System.out.println(obj.b);
				System.out.println(obj.c);
				System.out.println(obj.d);
				

			}
			
}
	 
