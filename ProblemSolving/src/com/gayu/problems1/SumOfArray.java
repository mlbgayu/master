package com.gayu.problems1;

/*
	Write a function that finds the sum of an array. Make your function recursive.
 */
public class SumOfArray {

	public static int sumArray(int sum, int array[], int index) {

		if (index == array.length) {
			return sum;
		}
		sum = sum + array[index++];
		return sumArray(sum, array, index);
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = SumOfArray.sumArray(0, array, 0);
		System.out.println(sum);
	}
}