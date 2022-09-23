package com.codeforce360.inheritance.example2;

public class Octopus extends Mammal{
	@Override
	int lifeSpan() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	@Override
	int noOfBabies() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	int noOfTentacles() {
		return 8;
	}
}
