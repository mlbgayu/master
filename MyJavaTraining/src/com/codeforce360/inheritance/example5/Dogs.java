package com.codeforce360.inheritance.example5;

public class Dogs {
		void pet(Bablu bb) {
			bb.dog1();
		}
	
	public static void main(String[] args) {
			Puppy p=new Puppy();
			Dogs d=new Dogs();
			d.pet(p);
	}

}
