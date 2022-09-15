package com.codeforce360.assignments2;

/*Swap two array values */
public class SwapArrayValue {

	static int a[] = { 11, 22, 33, 44, 55, 66 };

	static void swaparray(int index1, int index2) {

		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;

	}

	public static void main(String[] args) {
		swaparray(2, 3);
		System.out.println(a[2]);
		System.out.println(a[3]);
	}

}
