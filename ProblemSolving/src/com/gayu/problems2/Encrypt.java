/*
 * 
 Create two functions that take a string and an array and returns a coded or 
    decoded message. The first letter of the string, or the first element of the array represents 
    the Character Code of that letter. The next elements are the differences between 
     the characters: e.g. A +3 --> C or z -1 --> y. 

    Examples - 

1)	encrypt("Hello") ➞ [72, 29, 7, 0, 3]

 // H = 72, the difference between the H and e is 29 (upper- and lowercase). // The difference between the two l's is obviously 0.

2)	decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"

@author Gayathri
 * */

package com.gayu.problems2;

import java.util.Arrays;

public class Encrypt {

	int[] encrypt(String str) {
		int code[] = new int[str.length()];
		char charArray[] = str.toCharArray();
		code[0] = charArray[0];
		for (int i = 1; i < code.length; i++) {
			code[i] = charArray[i] - charArray[i - 1];
		}
		return code;
	}

	// [72, 29, 7, 0, 3]
	String decrypt(int charArray[]) {
		String decode = new String();
		int total = 0;
		for (int i = 0; i < charArray.length; i++) {
			total = total + charArray[i];
			char c = (char) total;
			decode = decode + c;
		}
		return decode.toString();
	}

	public static void main(String[] args) {
		// H = 72
		// e = 101
		// l = 108
		// l = 108
		// 0 = 111

		// Encrypt
		String str = "Hello";
		Encrypt e = new Encrypt();
		int decode[] = e.encrypt(str);

		// Decrypt
		int charArray[] = { 72, 33, -73, 84, -12, -3, 13, -13, -68 };
		String decodedString = e.decrypt(charArray);
		System.out.println(decodedString);

	}
}
