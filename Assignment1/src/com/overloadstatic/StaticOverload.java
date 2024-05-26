package com.overloadstatic;




class A {
   static void display() {
        System.out.println("From A");
    }
}

class B extends A {
  
   static void display() {
        System.out.println("From B");
    }
}

public class StaticOverload {
    public static void main(String[] args) {
        
        A.display();
    }
}
