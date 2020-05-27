package com.maddy;

import java.time.LocalDateTime;
import java.util.Scanner;



public class Menu {
	
	//attributes of a basic account
	
	private String name;
	private String surname;
	private double balance;
	
	//constructor 
	public Menu(String name, String surname) {
		
		this.name = name;
		this.surname = surname;
		
	}
	
	//getters and setters

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

	//method to display available balance
	public void displayBalance(double balance) {
		System.out.println("Your balance is: " + balance);
		
	}
	
	//method to withdraw
	public void withdraw(double amount) {
		
		//if the amount is not equal to 0, then proceed with the withdrawal
		if(amount != 0) {
			balance = balance - amount;
		} else { // else display message to the user
			
		}

		
	}
	
	//method to deposit the money to the account
	public void deposit(double amount) {
		
		//check if the amount is greater than zero. If not, add the deposit to the overall amount
		if(amount > 0) {
			balance = balance + amount;
			
		} 
				
	}
	
	//method to display the menu, using scanner class
			public void displayMenu() {
				//display current date
				LocalDateTime today = LocalDateTime.now();
					
				
				//use scanner class to take user's input
				char options = '\0';			
				Scanner scanner = new Scanner(System.in);
				
				System.out.println(today);
				System.out.println("Hello " + name + " " + surname);
				System.out.println("\n");
				System.out.println("Please choose one of the following options: " + "\n");			
				System.out.println("A. DISPLAY BALANCE");
				System.out.println("B. CASH WITHDRAWAL");
				System.out.println("C. CASH DEPOSIT");
				System.out.println("E. QUIT");
					
				do {
					
					options = scanner.next().charAt(0);
					
					switch (options) {
					case 'A':
						System.out.println("Your balance available is:" + "\t\t\t" + balance);
						System.out.println("\n");			
						break;
					case 'B':
						int withdrawnAmount = scanner.nextInt();
						withdraw(withdrawnAmount);
						System.out.println("Your are about to withdraw: " + "\t\t\t" + withdrawnAmount);
						System.out.println("\n");	
						break;
					case 'C':
						int depositAmount = scanner.nextInt();
						deposit(depositAmount);
						System.out.println("You are about to deposit: " + "\t\t\t" + depositAmount);
						System.out.println("\n");
						break;
					case 'E':
						System.out.println("***APPLICATION EXITED***");
						break;
					default:
						break;
					}
					
					
				} while (options != 'E');
				
					System.out.println("Thank you for using our services. See you again soon");
							
			}
	
	

}
