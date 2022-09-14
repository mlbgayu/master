package com.codeforce360.interviewQuestions;

/*
Write a function that reverses a string. Make your function recursive.
 */
public class RecursiveReverseString {
		
	
	
	public static String reverse(String str) {
		if (str.length()<=1) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}

	

	public static void main(String[] args) {
		String s="Bhavya";
		String rev=reverse(s);
		System.out.println(rev);
		
		

	}

}
