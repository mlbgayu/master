package com.codeforce360accessModifier;

public class StaticExample {
	static int i;
	int j;

	void stat() {
		System.out.println("static value of i is : " + i );
		System.out.println("Instant value of j is :" + this.j );
	}

	public static void main(String[] args) {

		StaticExample se = new StaticExample();
		se.j = 100;
		StaticExample.i = 200;
		StaticExample se1 = new StaticExample();
		se1.j = 100;
		StaticExample.i = 250;
		
		se.stat();
		se1.stat();
	}
}
