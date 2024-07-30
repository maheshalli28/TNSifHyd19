package com.day2;
//A constructor in Java is a special method that is used to initialize objects
//In Construct class name and method name is same 
//Creating a Main class 

public class Constructor {
	
		int x;    //Creating class attribute
		String name;
		void display() {
			
			System.out.println("Hello");
		}
	
//Creating method constructor for main class
		
 public Constructor() {
	 
	x=10;       
    name = "Mahesh";
	 
 }
 public static void main(String[] args) {
	 Constructor obj =new Constructor();

	 System.out.println(obj.x);
	 System.out.println(obj.name);
	 obj.display();
	 
 }
}
