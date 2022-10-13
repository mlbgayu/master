package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsogramTest {

	@Test
	void test() {
			Isogram im=new Isogram();
			boolean result=im.isIsogram("Algorism");
			assertEquals(true,result);
	}

}
