package com.day4;

public interface SecondInterface1{
	
       public void Main();
       
}

      interface Interface2{
	
	  public void Main2();	  
}

class Child implements SecondInterface1,Interface2{
	
	public void Main() {
		System.out.println("Interface cant accese directly ");
		
	}
	
	public void Main2() {
		System.out.println("Method name is not same so implements is used to in interface");
	}

}