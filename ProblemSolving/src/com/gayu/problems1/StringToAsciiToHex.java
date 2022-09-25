package com.gayu.problems;

/*
5.	Create a function that takes a string's characters 
	as ASCII and returns each character's hexadecimal value as a string.
	
	toHex("hello world") ➞ "68 65 6c 6c 6f 20 77 6f 72 6c 64" 
	toHex("Big Boi") ➞ "42 69 67 20 42 6f 69" 
	toHex("Marty Poppinson") ➞ "4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e"

 */
public class StringToAsciiToHex {

	static String stringToHexa(String str) {
		String returnString = "";
		// Converting string to character array
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int ascii = ch[i];
			String hexa = Integer.toHexString(ascii);
			returnString = returnString + hexa;

		}
		return returnString;
	}

	public static void main(String[] args) {

		String hexa = stringToHexa("Gayathri");
		System.out.println(hexa);

	}
}
