package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveReverseStringTest {

	@Test
	void test() {
		 RecursiveReverseString rrs=new RecursiveReverseString();
		 String result=rrs.reverse("Bhavya");
		 assertEquals("ayvahB",result);
	}

}
