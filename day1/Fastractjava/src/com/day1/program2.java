package com.day1;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scanner.nextInt();
		if(num%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
