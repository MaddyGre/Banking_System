package com.maddy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BasicAccount {

	//The following class will allow the user to create his own basic bank account.

	private String name;
	private String surname;
	private String email;
	private Address address;
	private long phoneNumber;


	// getters and setters

	public BasicAccount() {
		// TODO Auto-generated constructor stub
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
			System.out.println("Invalid email");
			return false;
		}

	}
	
	// method to validate phone number. Must have 9 digits
	public boolean isValidNumber(String phoneNumber) {
		
		String regex = "[0-9]{9}";
		
		if(phoneNumber.matches(regex)) {
			System.out.println("Valid phone number");
			return true;
		} else {
			System.out.println("Invalid phone number");
			return false;
		}
		
		
		
	}


	
	
	

}
