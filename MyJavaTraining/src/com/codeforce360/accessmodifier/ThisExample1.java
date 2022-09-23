package com.codeforce360.accessmodifier;

public class ThisExample1 {
	int a1, b1;

	void print(int pid, int cid) {
		this.a1 = pid;
		this.b1 = cid;
	}

	void print1() {
		System.out.println("This value for" + a1 + "" + b1);
	}

	public static void main(String[] args) {
		ThisExample1 te = new ThisExample1();
		te.print(100, 200);
		te.print1();

	}

}
