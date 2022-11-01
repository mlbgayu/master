package com.gayu.problems1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptDecryptTest {

	@Test
	void test() {
			EncryptDecrypt ed=new EncryptDecrypt();
			String result=ed.encrypt("Hello");
	}

}
