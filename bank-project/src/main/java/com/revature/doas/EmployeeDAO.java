package com.revature.doas;

public interface EmployeeDAO {

	// employee login (can we ask question on the console if it is employee or a user) 
	public void login(String username, String password);
	
	// approve or reject account
	
	
	// view customer balance
	public void viewCutomerAccount(int customer_id);
	
	// view log of transaction
	//public List<Tranx> gettranx(int customer_id, String type);
}
