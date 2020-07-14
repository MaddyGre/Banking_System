package com.maddy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BasicAccount {

	//The following class will allow the user to create his own basic bank account.

	private String name;
	private String surname;
	private String email;
	private long phoneNumber;

	public BasicAccount(String name, String surname) {
		this.name = name;
		this.surname = surname;	
	}
	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// method to validate email address. Must be in format word1@word.com
	public boolean isValidEmail(String email) {
		
		String pattern = "[\\w]+@[\\w]+\\.[a-z]{2,6}$";


		if(email.matches(pattern)) {
			return true;
		} else {
			System.out.println("Please enter a valid email");
			return false;
		}

	}
	
	// method to validate phone number. Must have 9 digits
	public boolean isValidNumber(String phoneNumber) {
		
		String regex = "[0-9]{9}";
		
		if(phoneNumber.matches(regex)) {
			return true;
		} else {
			System.out.println("Please enter a valid telephone number");
			return false;
		}
		
		
		
	}


	
	
	

}

