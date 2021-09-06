/**
 * 
 */
package com.bridgelabzday22;

import java.util.Scanner;
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
	public static void firstName() {

		String firstNameRegex = "^[A-Z].{2,}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName = sc.nextLine();

		Pattern pt = Pattern.compile(firstNameRegex);
		Matcher mt = pt.matcher(firstName);

		boolean result = mt.matches();

		if (result)
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");

	}
	
	/**
	 * This Function checks and prints if the last name entered is valid or not
	 * @param lastName This parameter takes the string input from the user 
	 */
	
	public static void lastName() {

		String lastNameRegex = "^[A-Z].{2,}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Name");
		String lastName = sc.nextLine();

		Pattern pt = Pattern.compile(lastNameRegex);
		Matcher mt = pt.matcher(lastName);

		boolean result = mt.matches();

		if (result)
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");

		sc.close();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to User Registration Program");
		firstName();
		lastName();

	}

}
