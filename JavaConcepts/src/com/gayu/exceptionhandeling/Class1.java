package com.gayu.exceptionhandeling;

import java.util.Scanner;

public class Class1 {

	void age() {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		age = sc.nextInt();
		assert (age > 10) && (age < 100);
		System.out.println("The entered age is:" + age); 

	}

	public static void main(String[] args) {
		Class1 c = new Class1();
		c.age();
	
	}

}