package com.day2;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		
		System.out.print("Enter value a:");
		int a = obj.nextInt();
		System.out.print("Enter value b:");
		int b = obj.nextInt();
		
		System.out.println("addtion:"+ (a+b));
		System.out.println("Sub:"+ (a-b));
		System.out.println("Mult:"+ (a*b));
		System.out.println("Div:"+ (a/b));
		System.out.println("modul:"+ (a%b));
		System.out.println("incr:"+ (a++));
		System.out.println("dec:"+ (a--));
		System.out.println("a value:"+ a);
		
		obj.close();
		
	}

}
