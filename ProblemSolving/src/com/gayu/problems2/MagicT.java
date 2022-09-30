package com.gayu.problems2;

import java.util.Arrays;

/*
 * 3. Write a function that takes in three parameters: r, c, i, where: r and c are the 
    number of rows   and columns to initialize a zero matrix. i represents the array
    of incrementing operations (+1). 
 
     Examples - 
	
1)	final(3, 3, ["2r", "2c", "1r", "0c"])

// Initialize a 3 x 3 matrix of zeroes. [ [0, 0, 0], [0, 0, 0], [0, 0, 0] ]

// Apply "2r" (increment index 2 row). [ [0, 0, 0], [0, 0, 0], [1, 1, 1] ] 
// Apply "2c" (increment index 2 column). [ [0, 0, 1], [0, 0, 1], [1, 1, 2] ] 

# Apply "1r" (increment index 1 row). [ [0, 0, 1], [1, 1, 2], [1, 1, 2] ] 

// Apply "0c" (increment index 0 column). // This is the result you should return. [ [1, 0, 1], [2, 1, 2], [2, 1, 2] ]

@author Gayathri
 */
public class MagicT {
	void printMagicT(int row, int column, String arr[]) {
		int zero = 0;
		int magicT[][] = new int[row][column];
		for (int k = 0; k < arr.length; k++) {
			String str = arr[k];
			int rowColNum = Integer.parseInt(str.substring(0, 1));
			String s = str.substring(1, 2);

			if (s.equals("r")) {
				int intArray[] = { 5, 4, 6, 46, 54, 12, 13, 17 };
				for (int i = 0; i < row; i++) {
					magicT[rowColNum][i] = magicT[rowColNum][i] + 1;
				}
			} else if (s.equals("c")) {
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < column; j++) {
						if (j == rowColNum) {
							magicT[i][j] = magicT[i][j] + 1;
						}

					}
				}
			}

		}

		System.out.println(Arrays.deepToString(magicT));

	}

	public static void main(String[] args) {
		String arr[] = { "2r", "2c", "1r", "0c" };
		MagicT obj = new MagicT();
		obj.printMagicT(3, 3, arr);
	}
}
