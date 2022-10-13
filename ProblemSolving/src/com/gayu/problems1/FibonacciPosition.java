package com.gayu.problems1;

/*
Create a function that, given a number, returns the corresponding value
 of that index in the Fibonacci series.
 */
public class FibonacciPosition {

	public static int findFib(int index) {
		if (index <= 1) {
			return index;
		}
		int position = 1;
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i <= index; i++) {
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			++position;
			if (num1 == index) {
				break;
			}
		}
		return position;

	}

	public static void main(String[] args) {

		/* 0 1 1 2 3 5 8 13 */
		int position = findFib(13);
		System.out.println(position);

	}
}
