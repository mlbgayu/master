package com.gayu.inheritance.example4;

public class Cars {
	 void car(Car1 Cc ) {
		 Cc.chevy();
	}
	public static void main(String[] args) {
		Car2 c2=new Car2();
	
		Cars c=new Cars();
		c.car(c2);
     
	}

}
