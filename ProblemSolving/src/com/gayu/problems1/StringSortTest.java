package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringSortTest {

	@Test
	void test() {
			StringSort ss=new StringSort();
			String result=ss.alphabetSoup("Gayathri");
			assertEquals("aaghirty",result);
	}

}
