package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToAsciiToHexTest {

	@Test
	void test() {
			StringToAsciiToHex ah=new StringToAsciiToHex();
			String result=ah.stringToHexa("Gayathri");
			assertEquals("4761796174687269",result);
	}

}
