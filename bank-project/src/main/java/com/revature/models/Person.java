package com.revature.models;

public abstract class Person {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	
	public Person(String firstName, String lastName, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}
 	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getuserName() {
		return username;
	}
	
	public void setName(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
	
}
