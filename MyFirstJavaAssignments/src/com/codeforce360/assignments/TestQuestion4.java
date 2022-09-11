package com.codeforce360.assignments;

public class TestQuestion4 {

	public static void main(String[] args) {
		int a=100, b=200;
		 System.out.println("Original value of a and b");
         System.out.println("a ="+ a);
         System.out.println("b ="+ b);
         a = a ^ b ^ (b = a);
         System.out.println("Swapped value of a and b");
         System.out.println("a ="+a);
         System.out.println("b ="+b);
         
         
         
	}

}
