package com.codeforce360.assignments;

import java.util.Scanner;

public class TestQuestion3 {

	public static void main(String[] args) {
		int n=0; 
		int sumOfEven = 0;
		int multOfOdd = 1;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
				if(i%2==0) {
					sumOfEven=sumOfEven+i;
					System.out.println("i = "+i+" sumofEven = "+sumOfEven);	
				}
				else {
					multOfOdd=multOfOdd*i;
					//System.out.println("i = "+i+" multOfOdd = "+multOfOdd);
			}
		}
		 System.out.println("Sum of all Even numbers under "+n+ " =  "+sumOfEven);
		 System.out.println("Multiplication of all Odd numbers under "+n+ " =  "+multOfOdd);
		
		

	}

}
