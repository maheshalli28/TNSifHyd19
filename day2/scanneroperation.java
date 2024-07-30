package com.day2;

import java.util.Scanner;

public class scanneroperation {
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		
		System.out.print("enter user name:");
		String username = myobj.nextLine();         //String
		System.out.println("username is "+ username);
		
		
		System.out.print("Enter number:");
		Long num = myobj.nextLong();                //long
		System.out.println("my num is "+num);   
		
		
		System.out.print("Enter age:");
		int age = myobj.nextInt();                  //int
		System.out.println("Age is "+age);
		
		System.out.print("float value:");           //float
		float data = myobj.nextFloat();
		System.out.print("Data is "+data);
		
		
		
		myobj.close();
		
	}

}
