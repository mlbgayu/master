package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LetterMatchTest {

	@Test
	void test() {
			LetterMatch lm=new LetterMatch();
			String  result=lm.sameVowelGroup(word, password, null, null, null);
			assertEQuals(result)
	}

}
