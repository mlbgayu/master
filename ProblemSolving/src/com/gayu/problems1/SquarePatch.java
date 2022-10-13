package com.gayu.problems1;

/*
Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

squarePatch(3) ➞ [[3, 3, 3],
                   [3, 3, 3],
                   [3, 3, 3] ] 



squarePatch(5) ➞ [[5, 5, 5, 5, 5], 
                   [5, 5, 5, 5, 5],
                   [5, 5, 5, 5, 5], 
                   [5, 5, 5, 5, 5], 
                   [5, 5, 5, 5, 5] ]

 */
public class SquarePatch {

	public static void square(int n) {
		System.out.println("[");
		for (int i = 0; i < n; i++) {
			System.out.print("[");

			for (int j = 0; j < n; j++) {
				System.out.print(n);
				if (j != (n - 1)) {
					System.out.print(",");
				}
			}

			System.out.print("]");
			if (i != (n - 1)) {
				System.out.print(",");

			}       
			System.out.println();
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		square(3);
	}
}
