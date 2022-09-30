package com.gayu.problems2;

import java.util.Arrays;

/*
 * Create a function that expands a decimal number into a string as shown below:
     
     25.24 ➞ "20 + 5 + 2/10 + 4/100" 
     70701.05 ➞ "70000 + 700 + 1 + 5/100" 
     685.27 ➞ "600 + 80 + 5 + 2/10 + 7/100"
 * */
public class DecimalConversion {

	static int getMultipleOfTens(int no) {
		int total = 1;
		if (no == 1) {
			return no;
		}
		for (int i = 0; i < (no - 1); i++) {
	 		total = total * 10;
		}
		return total;
	}

	String expandedForm(Float f) {
		String output = "";
		String str = f.toString();
		String splittedString[] = str.split("\\.");
		int number = Integer.valueOf(splittedString[0]);
		int decimal = Integer.valueOf(splittedString[1]);

		char charArray1[] = splittedString[0].toCharArray();
		int charArray1Size = charArray1.length;
		for (int i = 0; i < charArray1.length; i++) {
			int mult = Integer.parseInt(charArray1[i] + "") * getMultipleOfTens(charArray1Size);
			charArray1Size--;
			if (mult != 0)
				output = output + mult + "+";
		}

		char charArray2[] = splittedString[1].toCharArray();
		int charArray2Size = charArray2.length;
		for (int i = 0; i < charArray2.length; i++) {
			if (charArray2[i] != '0') {
				String mult = charArray2[i] + "/" + getMultipleOfTens(charArray2Size);
				charArray2Size++;
				output = output + mult;
				if (i != (charArray2.length - 1)) {
					output = output + "+";
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		
		float f = 25.24f;
//		f = 70701.05f;
//		f = 685.27f;
		DecimalConversion obj = new DecimalConversion();
		String output = obj.expandedForm(f);
		System.out.println(output);
	}
}
