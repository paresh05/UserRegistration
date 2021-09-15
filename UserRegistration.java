/**
 * 
 */
package com.bridgelabzday22;

import java.util.Scanner;
import java.util.function.Predicate;
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
	public static void firstName(){

		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName = sc.nextLine();
		
		Predicate<String> firstNameFilter = Pattern.compile(firstNameRegex).asMatchPredicate();
		System.out.println(firstNameFilter.test(firstName));

	}
	
	/**
	 * This Function checks and prints if the last name entered is valid or not
	 * @param lastName This parameter takes the string input from the user 
	 */
	
	public static void lastName() {

		String lastNameRegex = "^[A-Z]{1}[a-z]{2,}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Name");
		String lastName = sc.nextLine();
		
		Predicate<String> lastNameFilter = Pattern.compile(lastNameRegex).asMatchPredicate();
		System.out.println(lastNameFilter.test(lastName));
		
	}
	
	
	/**
	 * This Function checks and prints if the email entered is valid or not
	 * @param email This parameter takes the string input from the user 
	 */
	
	public static void email() {

		String emailRegex = "[a-z0-9]+(.[a-z0-9]+)@[a-z0-9]+.[a-z]*.[a-z]*$";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = sc.nextLine();

		Predicate<String> emailFilter = Pattern.compile(emailRegex).asMatchPredicate();
		System.out.println(emailFilter.test(email));
	}
	
	
	/**
	 * This Function checks and prints if the Mobile Number entered is valid or not
	 * @param mobileNumber This parameter takes the string input from the user 
	 */
	
	public static void mobileNumber() {

		String mobileNumberRegex = "^[0-9]{2}\s[0-9]{10}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile Number");
		String mobileNumber = sc.nextLine();

		Predicate<String> mobileNumberFilter = Pattern.compile(mobileNumberRegex).asMatchPredicate();
		System.out.println(mobileNumberFilter.test(mobileNumber));

		
	}
	
	/**
	 * This Function checks and prints if the Password entered is valid or not
	 * The rule-1 for a valid password is it should have minimum of 8 characters
	 * The rule-2 for a valid password is it should have at least 1 upper case character
	 * The rule-3 for a valid password is it should have at least 1 numeric number
	 * The rule-4 for a valid password is it should have at least 1 special character
	 * @param password This parameter takes the string input from the user 
	 */
	
	public static void password() {

		String passwordRegex = "((?=.*\\d)(?=.*[A-Z])(?=.*[$&+,:;=?@#|'<>.^*()%!-]).{8,})";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		String password = sc.nextLine();

		Predicate<String> passwordFilter = Pattern.compile(passwordRegex).asMatchPredicate();
		System.out.println(passwordFilter.test(password));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to User Registration Program");
		
		firstName();
		
		lastName();
		
		email();
		
		mobileNumber();
		
		password();
	}
}
