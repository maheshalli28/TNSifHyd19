package com.staticmem;

public class StaticMembers {
      static int a=20;
      static String display()
      {
    	  return "Its a Static Method";
      }
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(display());
		//or
		//System.out.println(StaticMembers.a);
		//System.out.println(StaticMembers.display());
	}

}
