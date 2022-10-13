package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DuplicateRemoverTest {

	@Test
	void testRemoveDups() {
		
		String input[] = {"1","0","1","0"};
		String expectedOutput[] = {"1", "0"};
		String actualOutput[] = DuplicateRemover.removeDups(input);
	//	System.out.println(Arrays.toString(actualOutput));
		Assert.assertArrayEquals( expectedOutput, actualOutput );
	}

}
