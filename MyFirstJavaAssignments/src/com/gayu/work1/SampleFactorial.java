package com.gayu.work1;

public class SampleFactorial {
	
	



	static int factorial(int f,int i) {
		if (i==0){
			return f;
		}
		
		f=f*(i--);
		return factorial( f,i);
	}


	public static void main(String[] args) {
		int factorial = factorial(1,4);
		System.out.println(factorial);
	}

}
