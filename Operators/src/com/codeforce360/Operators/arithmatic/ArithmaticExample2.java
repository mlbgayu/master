package com.codeforce360.Operators.arithmatic;




public class ArithmaticExample2 {

	static int a;
	static int b;

	void printAdd() {
		System.out.println("Addition = "+(a+b));
	}
	
	
	
	public static void main(String[] args) {
		
		
		ArithmaticExample2 obj1 = new ArithmaticExample2();
				
		ArithmaticExample2 obj2 = new ArithmaticExample2();
		obj2.a = 500;
		obj2.b= 500;
		
		obj2.printAdd();//1000

		obj1.printAdd();//1000

	}	
}

