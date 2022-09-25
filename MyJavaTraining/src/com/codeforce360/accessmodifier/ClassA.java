package com.codeforce360.accessmodifier;

public class ClassA extends Object {
	static int i;
	int j;

	ClassA() {
		super();
		System.out.println("Govindan");
	}

	ClassA(int j) {
		this.j = j;
	}

	void Print(int j) {
		System.out.println(this.j);
	}

	static int print(int i) {
		return ClassA.i * 10;
	}

	public static void main(String[] args) {

		ClassA obj1 = new ClassA();
		ClassA.i = 10;
		obj1.j = 10;
		ClassA obj2 = new ClassA();
		ClassA.i = 20;
		obj2.j = 20;

		obj1.Print(111);
		obj2.Print(222);
	}

}
