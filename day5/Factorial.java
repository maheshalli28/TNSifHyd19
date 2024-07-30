package com.day5;

import java.util.Scanner;

class Factorial {
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Factorial obj=new Factorail();

			Scanner obj = new Scanner(System.in);
			System.out.print("Enter x value:");
			int x =obj.nextInt();
			int fact =1;
			for(int i=1; i<=x; i++) {
				 fact =fact *i;
				 	
			}
     		System.out.println("Factorial of "+ x +" is:"+fact);
			
			
			
			obj.close();
			
	}
}