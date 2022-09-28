package com.gayu.problems2;

import java.util.Arrays;
/*
 * 
 * 6. Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range. See examples below.
 
Examples - 

inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5] 
inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]

@author Gayathri
 * */

public class ArrayGenerator {

	int[] inclusiveArray(int a, int b) {
		int gen[] = new int[(b - a)];
		for (int i = 0; i < gen.length; i++) {
			gen[i] = a++;
		}
		return gen;
	}

	public static void main(String[] args) {
		ArrayGenerator gen = new ArrayGenerator();
		int arr[] = gen.inclusiveArray(2, 8);
		System.out.println(Arrays.toString(arr));
	}
}
