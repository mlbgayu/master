package com.gayu.work1;

public class Sample {

	
	int b;
	int a;
	static int x;
	
	//Constructor 
	//Class name is same as constructor name 
	//No return type void or int or
	//Access modifier can be any private, public , protected
	//no static declation
	Sample(){
		
	}
	
	
	//method 
		//must have return type , either void or int etc 
	static void  doSomeJob(double a, int b ){
		System.out.println(a*b);
		
	}
	
	void doAnothehrJob() {
		
	}
	
	public static void main(String[] args) {
		 Sample.doSomeJob(9d,10);
		 Sample.x = 100;
		 
		 
		 Sample s = new Sample();
		 s.a = 1000;
		 s.b = 3000;
		 s.doAnothehrJob();
		 
		
	}
	
	
}
