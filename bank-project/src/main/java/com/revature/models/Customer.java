package com.revature.models;

public class Customer extends Person {

	private String DOB;
	private String SSN;
	private String Address;
	

	public Customer() {
		super(null, null, null, null);
	}
	
	public Customer(String firstName, String lastName, String username, String password, String DOB, String Address, String SSN) {
		super(firstName, lastName, username, password);
		this.DOB = DOB;
		this.SSN = SSN;
		this.Address = Address;
	}
	
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
