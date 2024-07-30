package com.day3;

//If subclass has the same method as declared in the parent class, it is known as method overriding in Java

	class Vehicle{  
		  //defining a method  
		  void run(){
			  System.out.println("Vehicle is running");
		  }  
		}  
		//Creating a child class  
		class Bike2 extends Vehicle{  
		  //defining the same method as in the parent class  
		  void run(){
			  System.out.println("Bike is running safely");
			  }  
		} 
		 

	

