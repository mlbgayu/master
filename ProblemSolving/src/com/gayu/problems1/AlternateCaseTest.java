package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlternateCaseTest {

	@Test
	void test() {
		AlternateCase ac=new  AlternateCase();
		String result=ac.alternatingCaps("Bhavya");
		assertEquals("BhAvYa",result);
	}

}
