package com.codeforce360.interviewQuestions;

/*
An isogram is a word that has no duplicate letters. Create a function that takes a string and returns either true or false depending on whether or not it's an "isogram".

Example - isIsogram("Algorism") ➞ true 
     isIsogram("PasSword") ➞ false
     isIsogram("Consecutive") ➞ false

 */
public class Isogram {

	static boolean isIsogram(String str) {
		boolean status = true;
		str = str.toLowerCase();
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					return false;
				}
			}
		}

		return status;

	}

	public static void main(String[] args) {
		String test1 = "Algorism";
		String test2 = "PasSword";
		boolean isIsogram = isIsogram(test2);
		System.out.println(isIsogram);

	}

}
