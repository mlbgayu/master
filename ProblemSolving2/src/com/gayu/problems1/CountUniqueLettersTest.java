package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountUniqueLettersTest {

	@Test
	void test() {
			CountUniqueLetters cul=new CountUniqueLetters();
			int result=cul.letter("GAYATHRIGOVIND", 'G');
			assertEquals(6,result);
	}

}
