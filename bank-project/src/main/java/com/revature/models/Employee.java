package com.revature.models;

public class Employee extends Person{

	private int id;
	
	public Employee(String firstName, String lastName, String username, String password, int id) {
		super(firstName, lastName, username, password);
		this.id = id;
	}
	public int getid() {
		return id;
	}
}
