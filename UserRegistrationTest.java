package com.bridgelabzd22;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabzday22.UserRegistration;

public class UserRegistrationTest {
	@Test
	public void firstNameReturnTrueWhenValid() {
		boolean result = UserRegistration.firstName("Paresh");
		assertEquals(true,result);		
	}
	
	@Test
	public void firstNameReturnFalseWhenInvalid() {
		boolean result = UserRegistration.firstName("paresh");
		assertEquals(false,result);	
	}
	
	@Test
	public void LastNameReturnTrueWhenValid() {
		boolean result = UserRegistration.lastName("Praveen");
		assertEquals(true,result);	
	}
	
	@Test
	public void LastNameReturnFalseWhenInvalid() {
		boolean result = UserRegistration.lastName("praveen");
		assertEquals(false,result);	
	}
	
	@Test
	public void EmailReturnTrueWhenValid() {
		boolean result = UserRegistration.email("paresh@gmail.com");
		assertEquals(true,result);	
	}
	
	@Test
	public void EmailReturnFalseWhenInvalid() {
		boolean result = UserRegistration.email("paresh.gmail.com");
		assertEquals(false,result);	
	}
	
	@Test
	public void PhoneReturnTrueWhenValid() {
		boolean result = UserRegistration.mobileNumber("91 9731497555");
		assertEquals(true,result);	
	}
	
	@Test
	public void PhoneReturnFalseWhenInvalid() {
		boolean result = UserRegistration.mobileNumber("9731497555");
		assertEquals(false,result);	
	}
	
	@Test
	public void PasswordReturnTrueWhenValid() {
		boolean result = UserRegistration.password("Paresh1@");
		assertEquals(true,result);	
	}
	
	@Test
	public void PasswordReturnFalseWhenInvalid() {
		boolean result = UserRegistration.password("paresh");
		assertEquals(false,result);	
	}

}
