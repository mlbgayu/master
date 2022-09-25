package com.gayu.work2;

/*Get Array value by passing the array index*/
public class ArrayValue {
	static int a[] = { 11, 22, 33, 44, 55, 66 };

	static int arrayValue(int index) {
		int value = a[index];
		return value;
	}

	public static void main(String[] args) {
		int value = ArrayValue.arrayValue(0);
		System.out.println(value);
	}

}
