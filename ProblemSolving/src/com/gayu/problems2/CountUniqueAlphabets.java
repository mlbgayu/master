package com.gayu.problems2;

import java.util.Arrays;
import java.util.HashSet;

/*
countUniqueBooks("AZYWABBCATTTA", 'A') ➞ 4 
// 1st bookend group: "AZYWA" : 3 unique books: "Z", "Y", "W" // 2nd bookend group: "ATTTA": 1 unique book: "T" // "ABBCA" not included since the first "A" was used in the 1st bookend group.

countUniqueBooks("ZZABCDEF", 'Z') ➞ 0
*/
public class CountUniqueAlphabets {

	int countUniqueBooks(String str, char s) {
		char chArray[] = str.toCharArray();
		System.out.println(Arrays.toString(chArray));
		boolean status = false;
		HashSet<Character> mainSet = new HashSet<Character>();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < chArray.length; i++) {
			if (chArray[i] == s) {
				status = !status;
				if(!status) {
					mainSet.addAll(set);
					
				}
			}
			if (status && chArray[i] != s) {
				set.add(chArray[i]);
			}
		}
		System.out.println(mainSet.toString());
		return mainSet.size();
	}

	public static void main(String[] args) {
		CountUniqueAlphabets obj = new CountUniqueAlphabets();
		int count = obj.countUniqueBooks("AZYWABBCATTTAOOAGHAAFGQH", 'A');
		System.out.println(count);
	}
}
