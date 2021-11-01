package com.revature.models;

public abstract class Account {

	private int Account_number;
	private double balance;
	private String type;
	
	public Account(int Account_number, double balance, String type) {
		this.Account_number = Account_number;
		this.balance = balance;
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public int getAccount_number() {
		return Account_number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
