package com.maddy;

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
	
	public boolean validateEmail(String email) {
		
		String pattern = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.(com|net)";
		
		if(email.equals(pattern)) {
			return true;
		}else {
			System.out.println("The email that you have entered is not valid");
			return false;
		}
		
		
	}
	
	
	
	
	

}
