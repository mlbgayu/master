package com.gayu.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExample {

		static void hashTableExample(){
		Hashtable<Integer, String> tableObj = 	new Hashtable<>();
	      tableObj.put(1,"Govindan");
	      tableObj.put(2,"Gayathi");
	      tableObj.put(3,"Bablu");
	      tableObj.put(4,"Bhavya");
	      tableObj.put(5,"Vyas");
	      
	      System.out.println(tableObj.get(5));
	      
	      Set<Integer> keySet =    tableObj.keySet();
			 
//			 Iterator<Integer> iter = keySet.iterator();
//			 
//			 while(iter.hasNext()) {
//				 Integer key = iter.next();
//				 String value = tableObj.get(key);
//				 System.out.println("Key = "+key+";  Value = "+value);
//				 
//			 }
	      
			for (Integer key : keySet) {
				String value = tableObj.get(key);
				System.out.println("Key = " + key + ";  Value = " + value);
			}
		}
	
	public static void main(String[] args) {
		hashTableExample();
	}
}

