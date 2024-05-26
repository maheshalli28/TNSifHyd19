package com.overrideninstance;

class A {
    void display() {
        System.out.println("From A");
    }
}

class B extends A {
    void display() {
        System.out.println("From B");
    }
}



public class InstanceOverriden {

	public static void main(String[] args) {
		 B obj = new B();
	        obj.display();

	}

}
