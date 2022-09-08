package com.codeforce360.operator.bitswise;

public class Bitwise_Example {

	public static void main(String[] args) {
		
		int a=6;
		int b=4;
		
		System.out.println("And ="+(a&b));
		System.out.println("Or  ="+(a|b));
		System.out.println("Xor  ="+(a^b));
		System.out.println("Not a ="+(~a));
		System.out.println("leftshift ="+(a<<1));
		System.out.println("Rightshift ="+(a>>1));
		
	}

}
