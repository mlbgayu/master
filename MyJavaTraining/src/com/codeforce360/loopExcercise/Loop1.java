package com.codeforce360.loopExcercise;

public class Loop1 {

	public static void printOdd(int n) {
		int i = 0;
		while (i <= n) {
			if ((i % 2) == 1) {
				System.out.println("i = " + i);
			}
			i++;
		}
		System.out.println("Final value of i = " + i);
	}

	public static void main(String args[]) {
		Loop1.printOdd(100);
	}

}
