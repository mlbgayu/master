package com.codeforce360.inheritance.example2;

public class Hierarchical1 {
	
	
	static void printProperty(Mammal obj1){
		System.out.println(obj1.lifeSpan());
		System.out.println(obj1.noOfBabies());
	}

	public static void main(String[] args) {

		
		Mammal obj1 = new Dog();
		Mammal obj2 = new Dolphin();
		Mammal obj3 = new Octopus();
		
		printProperty(obj1);
		printProperty(obj2);
		printProperty(obj3);
		
	
	}

}
