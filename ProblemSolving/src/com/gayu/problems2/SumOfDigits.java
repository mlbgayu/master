package com.gayu.problems2;

import java.util.Arrays;

/**
 * 
5. Create a function that takes one, two or more numbers as arguments and adds them together to get a new number. The function then repeatedly multiplies the digits of the new number by each other, yielding a new number, until the product is only 1 digit long. Return the final product.

Example - 

sumDigProd(16, 28) ➞ 6 
// 16 + 28 = 44 
// 4 * 4 =  16
 // 1 * 6 = 6

 * @author Gayathri
 *
 */
public class SumOfDigits {

	int sumDigProd(int a, int b) {
		int sum = a + b;
		while (true) {
			int total = 1;
			String strSum = (sum + "");
			if (strSum.length() == 1) {
				return Integer.valueOf(strSum);
			}
			char array[] = strSum.toCharArray();
			for (int i = 0; i < array.length; i++) {
				int no = Integer.valueOf(array[i] + "");
				total = total * no;
			}
			sum = total;
		}
	}

	public static void main(String[] args) {
		SumOfDigits digits = new SumOfDigits();

		int sum = digits.sumDigProd(16,28);
		System.out.println(sum);
	}

}
