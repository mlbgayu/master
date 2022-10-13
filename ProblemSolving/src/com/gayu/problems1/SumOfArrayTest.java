package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SumOfArrayTest {

	@Test
	void test() {
		
		int[] array = {1,2, 3, 4,5,6,7,8,9,10};
        int expectedOutput= 55;
        SumOfArray obj = new SumOfArray();
        int sum = SumOfArray.sumArray(0, array, 0);
		assertEquals( 55, sum);
		
	}

}
