package com.day3;

//Polymorphism a single action in many ways it over comes the multiple inheritance
//1. Runtime or Dynamic 
//2. Compiletime 

public class Polymorphism {
	void animal() {
		System.out.println("Its Sounds");
		
	}
}
class Dog extends Polymorphism{
	void animal() {
		System.out.println("Bow Bow");
	}
}

 class Cat extends Polymorphism{
	 void animal() {
		 System.out.println("Meow Meow");
	 }
	
}

	


