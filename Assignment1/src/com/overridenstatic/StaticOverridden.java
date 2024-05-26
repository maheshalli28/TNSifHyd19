package com.overridenstatic;

class A{
	static void display()
	{
		System.out.println("From A");
	}
}
class B extends A{
   
	static void display()
	{
		System.out.println("From B");
	}
}

public class StaticOverridden {

	public static void main(String[] args) {
                A.display();
	}

}
