package com.gayu.accessmodifier.example1;

public class LocalVariable {
	static int i;
	
	LocalVariable(int i){
		System.out.println(LocalVariable.i);
		System.out.println(this.i);
		
	}
	
	void someThing() {
		 LocalVariable var1= new LocalVariable(10);
		 System.out.println(this.i);
		 
	}
	
	public static void main(String[] args) {
		
		LocalVariable var1= new LocalVariable(10);
		var1.i=100;
		LocalVariable.i=100i
	}
}
