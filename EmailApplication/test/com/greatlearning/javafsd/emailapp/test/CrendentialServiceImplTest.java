package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;
//import com.greatlearning.javafsd.emailapp.model.Employee;
//import com.greatlearning.javafsd.emailapp.service.PasswordGenerator;

public class CrendentialServiceImplTest {

	public static void main(String[] args) {
		testDisplayCredentials();
	}

	static void testEmailAddressGeneration() {

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();

		Employee arul = new Employee("Arul", "Varman", "technical");

		String emailAddress = serviceImpl.generateEmailAddress(arul);

		System.out.println(emailAddress);
	}

	static void testPasswordGeneration() {

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		String password = serviceImpl.generatePassword();
		System.out.println("Password ->" + password);

	}

	static void testDisplayCredentials() {

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		Employee arul = new Employee("Arul", "Varman", "technical");

		serviceImpl.generateEmailAddress(arul);
		String password = serviceImpl.generatePassword();
		arul.setPassword(password);

		serviceImpl.displayCredentials(arul);
	}

}
