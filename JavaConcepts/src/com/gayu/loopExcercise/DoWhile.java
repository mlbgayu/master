package com.gayu.loopExcercise;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How Many Dollars Do You Want");
		 n= scanner.nextInt();
			
		  do{
			System.out.println( "$");
			 i++;
			 }while(i<=n);
	}	
}