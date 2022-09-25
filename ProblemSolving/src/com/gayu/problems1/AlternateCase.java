package com.gayu.problems1;

import java.util.stream.IntStream;

/*
Create a method that alternates the case of the letters in a string 

alternatingCaps("Hello") ➞ "HeLlO" 
alternatingCaps("How are you?") ➞ "HoW aRe YoU?" 
alternatingCaps("OMG this website is awesome!") ➞ "OmG tHiS wEbSiTe Is AwEsOmE!"
*/

public class AlternateCase {

	static String alternatingCaps(String str) {
		String returnstring = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 <= 0) {

				returnstring = returnstring + (ch[i] + "").toUpperCase();
			} else {
				returnstring = returnstring + (ch[i] + "").toLowerCase();
			}
		}
		return returnstring;

	}

	public static void main(String[] args) {
		String Hexa = alternatingCaps("BHAVYA");
		System.out.println(Hexa);
	}

}
