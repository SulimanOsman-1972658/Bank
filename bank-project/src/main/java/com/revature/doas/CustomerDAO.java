package com.revature.doas;

public interface CustomerDAO {

	// login
	public void login(String username, String password);
	
	// register for online banking
	public void register(String username, String password, String name, String lastname, int SSN, String data, String address);
	
	// apply for account
	
	// view balance 
	public double viewBalance(int account_id);
	
	// deposit 
	public double deposit(int account_id, double amount);
	
	// withdraw
	public double withdraw(int account_id, double amount);
	
	// transfer from one acc to another
	public double tranfer(int acc_id1, int acc_id2, double amount);
	
}
