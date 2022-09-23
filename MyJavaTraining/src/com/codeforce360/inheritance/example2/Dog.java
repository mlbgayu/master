package com.codeforce360.inheritance.example2;

public class Dog  extends Mammal{

	@Override
	int noOfBabies() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	@Override
	int lifeSpan() {
		// TODO Auto-generated method stub
		return 14;
	}
	
	int noOfLegs() {
		return 4;
	}
}
