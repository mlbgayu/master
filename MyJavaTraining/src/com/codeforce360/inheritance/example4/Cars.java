package com.codeforce360.inheritance.example4;

public class Cars {
	 void car(Car1 Cc ) {
		 Cc.chevy();
	}
	public static void main(String[] args) {
		Car1 c1=new Car1();
		Car2 c2=new Car2();
	
		Cars c=new Cars();
		c.car(c2);
     
	}

}
