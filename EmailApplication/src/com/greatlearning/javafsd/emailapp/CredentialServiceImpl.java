package com.greatlearning.javafsd.emailapp;

public class CredentialServiceImpl implements ICredentialService {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		String firstName = employee.getFirstName();
		String lasttName = employee.getLastName();
		String department = employee.getDepartment();

		StringBuilder emailBuilder = new StringBuilder();

		emailBuilder.append(firstName);
		emailBuilder.append(firstName.toLowerCase());
		// emailBuilder.append(".");
		// emailBuilder.append(lastName);
		// emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".gl.com");

		String emailAddress = emailBuilder.toString();

		employee.setEmailAddress(emailAddress);

		return emailAddress;

	}

	@Override
	public void displayCredentials(Employee employee) {

		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(", your generated credentials are as follows");

		String newline = System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email    --->  ");
		messageBuilder.append(employee.getEmailAddress());

		messageBuilder.append(newline);
		messageBuilder.append("Password ---> ");
		messageBuilder.append(employee.getPassword());

		String finalMessage = messageBuilder.toString();

		System.out.println(finalMessage);
	}

}
