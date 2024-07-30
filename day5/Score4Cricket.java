package com.day5;

import java.util.*;

public class Score4Cricket {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter a :");
		int a=s.nextInt();
		double score = a*20;
		System.out.println("Total runs scored in 20 overs:"+score);
		
		s.close();
		
	}
}
