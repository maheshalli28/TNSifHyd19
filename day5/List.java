package com.day5;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list=new ArrayList();   //Creating Array
		
		list.add("Mahesh");
		list.add("Pavan");
		list.add("Raju");
		list.add("Srikanth");
		
		System.out.println(list); 
		
		System.out.println(list.get(1)); //using index 
		
		for (String names:list) {    //using for loop 
			System.out.println(names);
			
		}
		
		
		
		

	}

}
