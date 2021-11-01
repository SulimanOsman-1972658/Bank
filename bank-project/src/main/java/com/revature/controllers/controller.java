package com.revature.controllers;

import java.util.*;

public class controller {

	public static void init() {
		
		// welcome message
		System.out.println("Welcome to the Rav Bank");
				
		// log in
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your Username: ");
		String input1 = scan.nextLine();
		System.out.print("Please enter your Password: ");
		String input2 = scan.nextLine();
		
		// have user make decision
		System.out.print("Please enter 1 for savings Account, and 2 for checking Account: ");
		System.out.println();
		int accountType = scan.nextInt();
		
		// view account balance 
		System.out.print("Your balance is: ");
		System.out.println();
		
		
		// 1) choose a savings account or checking account
				// deposit money
				// withdraw money		
				// go back
		System.out.print("Please enter 1 for deposit Account, 2 for withdraw, and 3 for return back to main menue: ");
		int option = scan.nextInt();
		System.out.println();
		
	
		// 3) log out
		System.out.print("Please enter 1 for logout: ");
		int result = scan.nextInt();
		System.out.println();
		
				
		// goodbye message
		System.out.println("Thanks for choosing Rav Bank");

	}
}
