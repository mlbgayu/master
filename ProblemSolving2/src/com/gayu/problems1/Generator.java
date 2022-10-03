package com.gayu.problems1;

import java.util.Arrays;

public class Generator extends Object {

	int[] array(int a, int b) {
		int type[] = new int[(b - a)];
		for (int i = 0; i < type.length; i++) {
			type[i] = a++;
		}
		return type;
	}

	public static void main(String[] args) {
		Generator g = new Generator();
		int arr[] = g.array(1, 15);
		System.out.println(Arrays.toString(arr));

	}

}
