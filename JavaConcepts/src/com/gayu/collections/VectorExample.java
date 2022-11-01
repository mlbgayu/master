package com.gayu.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	static void exampleVector() {
		
		Vector<String>  vectorObj = new Vector<>();
		vectorObj.add("Govindan");
		vectorObj.add("Gayathri");
		vectorObj.add("Gayathri");
		vectorObj.add("Bhavya");
		vectorObj.add("Vyas");
		
		System.out.println(vectorObj.size());
		

//		for(int i =0;i<vectorObj.size();i++) {
//			String str  = vectorObj.get(i);
//			System.out.println(str);
//		}
		
		for (String str : vectorObj) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
				exampleVector();
	}
}
