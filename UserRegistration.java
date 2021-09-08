/**
 * 
 */
package com.bridgelabzday22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author paresh.praveen_ymedi
 *
 */
public class UserRegistration {

	/**
	 * This Function checks and prints if the first name entered is valid or not
	 * @param firtsName This parameter takes the string input from the user 
	 */
	public static boolean firstName(String firstName) {

		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}";
		
		Pattern pt = Pattern.compile(firstNameRegex);
		Matcher mt = pt.matcher(firstName);

		boolean result = mt.matches();

		return result;
	}
	
	/**
	 * This Function checks and prints if the last name entered is valid or not
	 * @param lastName This parameter takes the string input from the user 
	 */
	
	public static boolean lastName(String lastName) {

		String lastNameRegex = "^[A-Z]{1}[a-z]{2,}";

		Pattern pt = Pattern.compile(lastNameRegex);
		Matcher mt = pt.matcher(lastName);

		boolean result = mt.matches();

		return result;
	}
	
	
	/**
	 * This Function checks and prints if the email entered is valid or not
	 * @param email This parameter takes the string input from the user 
	 */
	
	public static boolean email(String email) {

		String emailRegex = "[a-z0-9]+(.[a-z0-9]+)@[a-z0-9]+.[a-z]*.[a-z]*$";
		
		Pattern pt = Pattern.compile(emailRegex);
		Matcher mt = pt.matcher(email);

		boolean result = mt.matches();

		return result;
	}
	
	
	/**
	 * This Function checks and prints if the Mobile Number entered is valid or not
	 * @param mobileNumber This parameter takes the string input from the user 
	 */
	
	public static boolean mobileNumber(String mobileNumber) {

		String mobileNumberRegex = "^[0-9]{2}\s[0-9]{10}";

		Pattern pt = Pattern.compile(mobileNumberRegex);
		Matcher mt = pt.matcher(mobileNumber);

		boolean result = mt.matches();
		
		return result;
	}
	
	/**
	 * This Function checks and prints if the Password entered is valid or not
	 * The rule-1 for a valid password is it should have minimum of 8 characters
	 * The rule-2 for a valid password is it should have at least 1 upper case character
	 * The rule-3 for a valid password is it should have at least 1 numeric number
	 * The rule-4 for a valid password is it should have at least 1 special character
	 * @param password This parameter takes the string input from the user 
	 */
	
	public static boolean password(String password) {

		String passwordRegex = "((?=.*\\d)(?=.*[A-Z])(?=.*[$&+,:;=?@#|'<>.^*()%!-]).{8,})";

		Pattern pt = Pattern.compile(passwordRegex);
		Matcher mt = pt.matcher(password);

		boolean result = mt.matches();

		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to User Registration Program");
		
	}

}
