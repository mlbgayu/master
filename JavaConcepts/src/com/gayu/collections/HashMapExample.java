package com.gayu.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	static void hashMapExample() {

		HashMap<String, String> mapObj = new HashMap<>();
		mapObj.put("Govindan", "Java Developer");
		mapObj.put("Gayathri", "Full Stack Developer");
		mapObj.put("Bablu", "Oracle SQL Developer");
		mapObj.put("Bhavya", "Dev Opsr");
		mapObj.put("Vyas", "Javascript Developer");

		Set<String> keySet = mapObj.keySet();

//		 Iterator<String> iter = keySet.iterator();

//		 while(iter.hasNext()) {
//			 String key = iter.next();
//			 String value = mapObj.get(key);
//			 System.out.println("Key = "+key+";  Value = "+value);
//			 
//		 }

		for (String key : keySet) {
			String value = mapObj.get(key);
			System.out.println("Key = " + key + ";  Value = " + value);
		}

	}

	public static void main(String[] args) {
		hashMapExample();
	}

}
