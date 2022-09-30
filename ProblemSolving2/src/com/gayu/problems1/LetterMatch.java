package com.gayu.problems1;

import java.util.Arrays;

public class LetterMatch {
	
		public String[]sameVowelGroup(String[]words){
			String result[]=new String[words.length];
			String firstword=words[0];
			int init=0;
			result[init++]=firstword;
			char charArray[]=firstword.toCharArray();
			for(int i=1;i<words.length;i++) {
				String word=words[i];
				boolean status=true;
				for(int j=0;j<charArray.length;j++) {
					if(!word.contains(charArray[j]+"")) {
						status=false;
					}
				}
				if(status) {
					result[init++]=word;
				}
			}
			return result;
		}
	
	public static void main(String[] args) {
		String words[]= {"word","pass","password","title","result"};
		LetterMatch lm=new LetterMatch();
		String matchedWords[]=lm.sameVowelGroup(words);
		System.out.println(Arrays.toString(matchedWords));
	}
}
