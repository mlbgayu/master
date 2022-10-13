package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidEmailTest {

	@Test
	void test() {
			ValidEmail ve=new ValidEmail();
			boolean result=ve.validEmail( "h@hallo.com");
			assertEquals(true,result);
	}

}
                                         