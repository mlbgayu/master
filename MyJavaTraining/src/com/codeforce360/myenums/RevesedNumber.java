package com.codeforce360.myenums;

public class RevesedNumber {

	public static void main(String[] args) {
		int n=456;
		int rev=0;
		
		while(n != 0) {
			rev=rev *10;
			rev=rev + n%10;
			n = n/10;
			
			System.out.println("Reversed Number is"+rev);
			
			
		}

	}

}
