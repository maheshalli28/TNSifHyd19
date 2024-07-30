package com.day2;

public class methods {
		
    static void staticmethod() {                       //static
    	 System.out.println("It is static method directly call the method");
    	 
    	 
     }
     public void publicmethod() {                      //public or instance
    	System.out.println("in public method we need to create obj to call method");
    	
    }
     
    static int staticmethod1(int x) {                 //static with return
    	return x;
    }
    
    public int publicmethod1(int y) { 
                                                     //instance with return
    	return y;
    }
    static String method(String s) {
    	return s;
    	
    }
     public static void main(String[] args) {
		
     staticmethod();
 //-------------------
     
     methods a=new methods();
     a.publicmethod();
     
 //-------------------   
     
     System.out.println(staticmethod1(12));
     
 //------------------- 
     
     methods b= new methods();
     System.out.println(b.publicmethod1(23));
     
 //-------------------
     
     System.out.println(method("Mahesh"));
     
     }
	
   
}

