package com.gayu.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	static void exampleSet() {
		
		Set<String>  setObj = new HashSet<>();
		setObj.add("Govindan");
		setObj.add("Gayathri");
		setObj.add("Gayathri");
		setObj.add("Bhavya");
		setObj.add("Vyas");
		
		System.out.println(setObj.size());
		
//		 Iterator<String> it = setObj.iterator();
//		 
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}

		for (String str : setObj) {
			System.out.println(str);
		}
		
	}
	
	public static void main(String[] args) {
		exampleSet();
	}
}
