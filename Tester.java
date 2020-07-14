package com.maddy;

import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BasicAccount acc = new BasicAccount("Maddy", "Robinson");		
		String pNumber = "744064239";
		acc.isValidNumber(pNumber);
		
		String address = "maddy@gmail.com";
		acc.isValidEmail(address);
		
		try {
			
			if(acc.isValidEmail(address)  == true && acc.isValidNumber(pNumber) == true) {
				System.out.println("Congratulations, you have successfully created your basic current account!");
			} else {
				System.out.println("Something went wrong, please try again");
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		Menu menu = new Menu("Maddy", "Robinson");
		menu.displayMenu();
		
		

	}

}
