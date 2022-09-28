package com.gayu.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	void doHashSet() {

		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> it =   set.iterator();
		
		while(it.hasNext()) {
				int var = it.next();
				System.out.println(var);
		}
	}
	
	public static void main(String[] args) {
		HashSetExample example = new HashSetExample();
		example.doHashSet();
		
	}

}
