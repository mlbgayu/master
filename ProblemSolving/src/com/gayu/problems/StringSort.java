package com.gayu.problems;

import java.util.Arrays;

/*
Create a method that takes a string and returns a string with its letters in alphabetical order.
 * */
public class StringSort {

	static String alphabetSoup(String str) {
		str = str.toLowerCase();
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		String newString = new String(charArray);
		return newString;
	}

	public static void main(String[] args) {
		/* Sort string */
		String sortedString = alphabetSoup("Gayathri");
		System.out.println(sortedString);
	}
}
