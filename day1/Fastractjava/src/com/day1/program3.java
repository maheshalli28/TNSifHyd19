package com.day1;
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter number:");
		int n = scanner.nextInt();
		int fact =1;
		for (int i=1;i<=n;i++)
			fact*=i;
		{
			System.out.println(fact);
		}
		
		

	}

}
