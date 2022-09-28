package com.gayu.encryptdecrypt;

public class EncryptDecrypt {

	int[] encrypt(String s) {
		int code[] = new int[s.length()];
		char charArray[] = s.toCharArray();
		code[0] = charArray[0];
		for (int i = 1; i < code.length; i++) {
			code[i] = charArray[i] - charArray[i - 1];
		}
		return code;
	}

	String decrypt(int charArray[]) {
		String decode = new String();
		int total = 0;
		for (int i = 0; i < charArray.length; i++) {
			total = total + charArray[i];
			char c = (char) +total;
			decode = decode + c;

		}
		return decode.toString();
	}

	public static void main(String[] args) {
		String s = "Hello";
		EncryptDecrypt ED = new EncryptDecrypt();
		int decode[] = ED.encrypt(s);

		int charArray[] = { 72, 33, -73, 84, -12, -3, 13, -13, -68 };
		String decodedString = ED.decrypt(charArray);
		System.out.println(decodedString);

	}

}
