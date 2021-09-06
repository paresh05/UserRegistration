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
	
	public static void firstName() {
		
		String firstNameRegex="^[A-Z].{2,}" ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName=sc.nextLine();
		
		Pattern pt = Pattern.compile(firstNameRegex);
		Matcher mt = pt.matcher(firstName);
		
		boolean result = mt.matches();
		
		if(result)
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
		
		sc.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to User Registration Program");
		firstName();
		
	}

}
