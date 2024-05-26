package com.overloadinstance;

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

public class InstanceOverload {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
