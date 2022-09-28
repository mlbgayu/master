package com.gayu.matrix.e1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixExample {
	
	void classM(int row,int column,String arr[]) {
		int z=0;
		int matrixexample[][]=new int[row][column];
		for(int x=0;x<arr.length;x++){
			String s= arr[x];
			int rowcolumn=Integer.parseInt(s.substring(0, 1));
			String str=s.substring(1,2);
			if (s.equals("r")) {
				int array[]= { 5, 4, 6, 46, 54, 12, 13, 17 };
				for(int i=0;i<row;i++) {
					matrixexample[rowcolumn][i]=matrixexample[rowcolumn][i]+1;
				}
			}
			else if(s.equals("c")) {
				for(int i=0;i<row;i++) {
					for(int j=0;j<column;j++) {
						if(j==rowcolumn) {
							matrixexample[i][j]=matrixexample[i][j]+1;
						}
					}
				}
			}
		}
		 System.out.println(Arrays.deepToString(matrixexample));
	}
	
	public static void main(String[] args) {
		String arr[]= {"2r","2c","1r","0c"};
		MatrixExample  me=new MatrixExample();
		me.classM(3, 3, arr);
		

	}

}
