package com.codeforce360.interviewQuestions;


/**
Create a method that takes an array of strings or integers, removes all duplicate items 
and returns a new array in the same sequential order as the old array (minus duplicates).

removeDups([1, 0, 1, 0]) ➞ [1, 0] 
removeDups(["The", "big", "cat"]) ➞ ["The", "big", "cat"] 
removeDups(["John", "Taylor", "John"]) ➞ ["John", "Taylor"]

 */
public class DuplicateRemover {
	
	private static String[] removeDups(String[] origArray) {
		int duplicateSize = 0;
		for (int i = 0; i < origArray.length - 1; i++) {
			for (int j = i + 1; j < origArray.length - 1; j++) {
				if (origArray[i]!=null && origArray[i].equals( origArray[j])) {
					origArray[j] = null;
					++duplicateSize;
				}
			}
		}
		origArray[origArray.length - 1] = null;
		int newSize = (origArray.length-1)-duplicateSize;
		String newArray[] = new String[newSize];
		int j = 0;
		for (int i = 0; i < origArray.length; i++) {
			if (origArray[i] != null) {
				newArray[j++] = origArray[i];
			}
		}

		return newArray;
	}
	
	public static void main(String[] args) {
		String arr[] = { "10", "20", "20", "30", "30", "40", "50", "50", "10","50" };
		int length = arr.length;
		String newArray[] = removeDups(arr);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

}
