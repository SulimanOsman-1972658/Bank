package com.revature.models;

public class SavingsAcc extends Account{


	private double intrest_rate;

	public SavingsAcc(int Account_number, double balance, String type, double intrest_rate) {
		super(Account_number, balance, type);
		this.intrest_rate = intrest_rate;
	}
	
	public double getIntrest_rate() {
		return intrest_rate;
	}

	public void setIntrest_rate(double intrest_rate) {
		this.intrest_rate = intrest_rate;
	}	
}
