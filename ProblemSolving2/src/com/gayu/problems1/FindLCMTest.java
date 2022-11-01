package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindLCMTest {

	@Test
	void test() {
		int[] array = { 8,7,6,5,4,4,5,6,7,8 };
        int expectedOutput= 840;
        FindLCM lcm = new FindLCM(array);
        int result=lcm.findlcm();
		assertEquals( 840, result);
		
	}

}
