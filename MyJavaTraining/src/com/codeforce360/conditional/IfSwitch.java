package com.codeforce360.conditional;
 
public class IfSwitch {

	static void testSwitch(int month,int year) {
		
		switch(month)
		{
		case 1:
		System.out.println("january,"+year);
		break;
		case 2:
		System.out.println("february "+year);
		break;
		case 3:
		System.out.println("march "+year);
		break;
		case 4:
		System.out.println("april"+year);
		break;
		case 5:
		System.out.println("may" +year);
		break;
		case 6:
		System.out.println("june"+year);
		break;
		default:
			System.out.println("");
			break;
		
	}

	}
	
	
	public static void main(String[] args) {
		IfSwitch.testSwitch(2,2002);		
		IfSwitch.testSwitch(6,2012);
}
}