package com.codeforce360.assignments2;

/*Get Array index by passing the array value*/
public class FindIndex {

	static int a[] = { 11, 22, 33, 44, 55, 66 };

	static int indexValue(int value) {
		int index = 99;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int index = FindIndex.indexValue(55);
		System.out.println(index);
	}

}
