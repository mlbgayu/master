package com.gayu.problems2;

import java.util.Arrays;

/*
 Create a function that takes an array of more than three numbers and 
 returns the Least  Common Multiple (LCM). 
 Examples - 
lcmOfArray([5, 4, 6, 46, 54, 12, 13, 17]) ➞ 2744820
lcmOfArray([46, 54, 466, 544]) ➞ 78712992
*/
public class LCM {
	int intArray[];

	LCM(int intArray[]) {
		this.intArray = intArray;
	}

	int lcmOfArray() {
		int finalLCM = 1;
		int divisor = 2;
		while (true) {
			int counter = 0;
			boolean divisible = false;
			for (int i = 0; i < this.intArray.length; i++) {
				if (this.intArray[i] == 0) {
					return 0;
				}
				if (this.intArray[i] == 1) {
					counter++;
				}
				if (this.intArray[i] % divisor == 0) {
					divisible = true;
					this.intArray[i] = this.intArray[i] / divisor;
				}
			}
			System.out.println(Arrays.toString(this.intArray));
			if (divisible) {
				finalLCM = finalLCM * divisor;
			} else {
				divisor++;
			}
			if (counter == this.intArray.length) {
				return finalLCM;
			}

		}

	}

	public static void main(String[] args) {
		int intArray[] = { 5, 4, 6, 46, 54, 12, 13, 17 };
		LCM obj1 = new LCM(intArray);
		int result = obj1.lcmOfArray();
		System.out.println("The Least Common Multiple of " + Arrays.toString(intArray) + " is " + result);
	}
}
