package com.gayu.problems2;

import java.util.Arrays;

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
