package com.gayu.problems2;

import java.util.Arrays;

/*
 *  Write a function that selects all words that have all the same vowels (in any order and/or number) as the first word, including the first word.


sameVowelGrousp(["toe", "ocelot", "maniac"]) ➞ ["toe", "ocelot"]
sameVowelGroup(["many", "carriage", "emit", "apricot", "animal"]) ➞ ["many"]

 * */
public class StringMatch {

	public String[] sameVowelGroup(String[] words) {
		String result[] = new String[words.length];
		String firstWord = words[0];
		int init = 0;
		result[init++] = firstWord;
		char charArray[] = firstWord.toCharArray();
		for (int i = 1; i < words.length; i++) {
			String word = words[i];
			boolean status = true;
			for (int j = 0; j < charArray.length; j++) {
				if (!word.contains(charArray[j] + "")) {
					status = false;
				}
			}
			if (status) {
				result[init++] = word;
			}
		}
		return result;
	}

	public static void main(String[] args) {
//		String words[] = {"toe", "ocelot", "maniac"};
		String words[] = {"many", "carriage", "emit", "apricot", "animal"};
		StringMatch obj = new StringMatch();
		String matchedWords[] = obj.sameVowelGroup(words);
		System.out.println(Arrays.toString(matchedWords));
	}

}
