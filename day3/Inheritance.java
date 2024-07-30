package com.day3;

//inheritance is getting the properties from parent to child class 
//1. Single level 
//2. Multiple level    >it is not possible due to same methods in parent class
//3. Herical Level     >1 Parent to many child classes
//4. Hybride level     >combinarion of single and 
//5. Multi level       >it extends parent to child and child to grand child

 class Parent 
 {   //Parent class 
	 void show() {
	int salary =4000;
			System.out.println(salary);
	
    }
	
 }
	 
 
 class Child extends Parent {   //Child class extends key word is used
	 void display(){
	 int bonous = 1000;
	 System.out.println(bonous);
	 }
	 
 }
 class Grandchild extends Child{
	 void display1() {
		 System.out.println("Its a grand Child calss");
	 }
 }

