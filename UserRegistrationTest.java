package com.bridgelabzd22;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.bridgelabz.MoodAnalyserException;
import com.bridgelabzday22.UserRegistration;
import com.bridgelabzday22.UserRegistrationException;

public class UserRegistrationTest {
	@Test
	public void firstNameReturnTrueWhenValid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.firstName("Paresh");
			assertEquals(true,result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test
	public void firstNameReturnFalseWhenInvalid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.firstName("paresh");
			assertEquals(false,result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test
	public void LastNameReturnTrueWhenValid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.lastName("Praveen");
			assertEquals(true,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void LastNameReturnFalseWhenInvalid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.lastName("praveen");
			assertEquals(false,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void EmailReturnTrueWhenValid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.email("paresh@gmail.com");
			assertEquals(true,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void EmailReturnFalseWhenInvalid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.email("paresh.gmail.com");
			assertEquals(false,result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test
	public void PhoneReturnTrueWhenValid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.mobileNumber("91 9731497555");
			assertEquals(true,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void PhoneReturnFalseWhenInvalid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.mobileNumber("9731497555");
			assertEquals(false,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void PasswordReturnTrueWhenValid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.password("Paresh1@");
			assertEquals(true,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void PasswordReturnFalseWhenInvalid() {
		boolean result;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyserException.class);
			result = UserRegistration.password("paresh");
			assertEquals(false,result);	
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
