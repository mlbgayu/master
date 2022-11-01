package com.gayu.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	static void exampleLsist() {

		List<String> listObj = new ArrayList<>();
		listObj.add("Govindan");
		listObj.add("Gayathri");
		listObj.add("Gayathri");
		listObj.add("Bhavya");
		listObj.add("Vyas");

		System.out.println("Size of List  = " + listObj.size());

//		for(int i =0;i<listObj.size();i++) {
//			String str  = listObj.get(i);
//			System.out.println(str);
//		}

		for (String str : listObj) {
			System.out.println(str);
		}

	}

	public static void main(String[] args) {

		ListExample.exampleLsist();
	}

}
