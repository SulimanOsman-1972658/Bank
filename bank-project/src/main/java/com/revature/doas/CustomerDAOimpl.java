package com.revature.doas;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAOimpl implements CustomerDAO {

	// create connection to the database
	private Connection conn;
	private PreparedStatement statement;
	
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(String username, String password, String name, String lastname, int SSN, String data,
			String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double viewBalance(int account_id) {
		return 0;
	}

	@Override
	public double deposit(int account_id, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdraw(int account_id, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tranfer(int acc_id1, int acc_id2, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// we need close statement at the end 
	private void closeResources() {
		try {
			if(statement != null && !statement.isClosed()) {
				statement.close();
			}
			
		} catch(SQLException e) {
			System.out.println("Error: could not close resources.");
			e.printStackTrace();
		}
	}
 	

}
