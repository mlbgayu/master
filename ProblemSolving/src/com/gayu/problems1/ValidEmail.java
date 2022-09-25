package com.gayu.problems1;

/*
	Create a function that accepts a string, checks if it's a valid email address and returns either true or false, depending on the evaluation. 

●	The string must contain an @ character. 
●	The string must contain a . character.
●	 The @ must have at least one character in front of it. e.g. "h@hallo.com" is valid while "@hallo.com" is invalid. 
●	The . and the @ must be in the appropriate places. e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid. If the string passes these tests, it's considered a valid email address.

 */
public class ValidEmail {

	static boolean validEmail(String email) {
		boolean validemail = false;
		int atcount = email.length() - email.replaceAll("\\@", "").length();
		int dotcount = email.length() - email.replaceAll("\\.", "").length();
		String emailsplit[] = email.split("\\@");

		if (atcount == 1 && dotcount == 1 && emailsplit.length == 2 && emailsplit[0].length() >= 1) {
			String email2ndsplit[] = emailsplit[1].split("\\.");
			if (email2ndsplit.length == 2) {
				validemail = true;
			}
		}
		return validemail;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email1 = "h@hallo.com";
		String email2 = "hello.email@com";
		String email3 = "hello@edabit.com";
		String email4 = "@hallo.com";
		String email5 = "hello@edabit.";
		String email6 = "asas.hello@edabit";

		boolean isValidEmail = validEmail(email6);
		System.out.println(isValidEmail);

	}

}
