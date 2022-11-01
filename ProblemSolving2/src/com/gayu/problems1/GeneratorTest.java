package com.gayu.problems1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GeneratorTest {

	@Test
	void test() {
			Generator ge=new Generator();
	       int[] res= new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	        int[] result= ge.array(1, 15);
			Assert.assertArrayEquals(res,result);
	}

}
