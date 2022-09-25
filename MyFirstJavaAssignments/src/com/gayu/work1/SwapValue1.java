package com.gayu.work1;

import java.security.DomainCombiner;

public class SwapValue1 {

	
	static void spapInt(int x) {
		int a = 6;
		int b = 7;
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println("a = "+a);
		 System.out.println("b = "+b);
		
	}
	
	static void normalSwap() {
		int a = 6;
		int b = 7; 
		 int temp;
		 
		
		 temp= a; //6
		 a = b;//7
		 b= temp;
		 
		 System.out.println("a = "+a);
		 System.out.println("b = "+b);
		
		
	}
	
	
	public static void main ( String args[]) {
		
		SwapValue1.spapInt(1);
	}
}
