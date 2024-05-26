package com.instance;

public class InstanceMembers {
	int a =10;
	void display()
	{
		System.out.println("It's a Instance method");
	}

	public static void main(String[] args) {
		InstanceMembers i1=new InstanceMembers();
		System.out.println(i1.a);
		i1.display();

	}

}
