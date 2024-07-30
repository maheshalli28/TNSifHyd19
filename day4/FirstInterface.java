package com.day4;

//An interface is a completely "abstract class" that is used to group related methods with empty bodies

public interface FirstInterface {
	
		  public void myMethod(); // interface method
		
        }
		interface SecondInterface {
		  public void myOtherMethod(); // interface method
		}
		interface ThirdInterface{
			void empty();
			
		}

		class DemoClass implements FirstInterface, SecondInterface, ThirdInterface {  
		//Implementation write in child class
		
		  public void myMethod() {
		    System.out.println("The Implemrntation of 1st interface takes in class");
		  }
		  public void myOtherMethod() {
		    System.out.println("Child class is used to implementation with same method name");
		  }
		 public void empty() {
			 System.out.println("Interface is implemented");
			 
		 }
			  
		  
		}

