package com.codeforce360.inheritance.example2;

public class Dolphin extends Mammal{

	@Override
	int lifeSpan() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	@Override
	int noOfBabies() {
		// TODO Auto-generated method stub
		return 60;
	}
	
	int noOfWings() {
		return 2;
	}
}

