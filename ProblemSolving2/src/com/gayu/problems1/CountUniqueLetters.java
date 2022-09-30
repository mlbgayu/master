package com.gayu.problems1;

import java.util.HashSet;

import org.w3c.dom.CharacterData;

import com.gayu.collections.HashSetExample;

public class CountUniqueLetters {

	int letter(String s, char c) {

		char[] chArray = s.toCharArray();
		boolean status = false;
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> set1 = new HashSet<Character>();
		for (int i = 0; i < chArray.length; i++) {
			if (chArray[i] == c) {
				status = !status;
				if (!status) {
					set.addAll(set1);
				}
			}
			if (status && chArray[i] != c) {
				set1.add(chArray[i]);
			}
		}
		System.out.println(set.toString());
		return set.size();

	}

	public static void main(String[] args) {
		CountUniqueLetters cul = new CountUniqueLetters();
		int count = cul.letter("GAYATHRIGOVIND", 'G');
		System.out.println(count);
	}

}
