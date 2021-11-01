package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {

	// postgres login info
	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "12345Ss@";
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/Bank_database";
	
	public static void main(String[] args) {
		// try to register our driver
		try {
			// registers a driver to driver manager: class responsible for getting connection
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not register driver");
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
			System.out.println("Connection is valid: " + conn.isValid(5));
		} catch (SQLException e) {
			System.out.println("Connection attempt failed!");
			e.printStackTrace();
		}
	}
}
