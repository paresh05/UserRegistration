package com.bridgelabzd22;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabzday22.UserRegistration;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {
	
	String input;
	boolean expected;
	UserRegistration object;

	@Before
	public void initialize() {
		object = new UserRegistration();
	}

	//Constructor
	public UserRegistrationParameterizedTest(String input, boolean expected) {
		
		this.input = input;
		this.expected = expected;

	}



	@Parameterized.Parameters	
	public static Collection<Object[]> input() {

		return Arrays.asList(new Object[][] { {"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
		{"abc",false},{"bc@.com.my",false},{"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},{"abc@gmail.com.1a",false},{"abc@%*.com",false},{"abc.@gmail.com",false},{"abc@gmail.com.aa.au",false}
		});
		
	}


	@Test
	public void emailTest() {
		assertEquals(expected, UserRegistration.email(input));
	}
}
