package com.codeforce360.myenums;

public class Example {

	enum  Season {

		Winter, summer, spring , autum;

	}
	
	public static void main(String[] args) {
		Season  currentSearson = Season.Winter;
		
		if ( currentSearson .equals(Season.Winter)) {
			System.out.println(" Its "+Season.Winter);
			
		}
	}
}
