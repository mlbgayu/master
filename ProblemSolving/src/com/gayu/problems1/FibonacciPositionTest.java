package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciPositionTest {

	@Test
	void test() {
			FibonacciPosition fp=new FibonacciPosition();
			int result=fp.findFib(13);
			assertEquals(8,result);
	}

}
