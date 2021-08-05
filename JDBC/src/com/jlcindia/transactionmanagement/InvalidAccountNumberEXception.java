package com.jlcindia.transactionmanagement;

public class InvalidAccountNumberEXception extends Exception {
	int accno;
	public InvalidAccountNumberEXception() {
		// TODO Auto-generated constructor stub
	}
	public InvalidAccountNumberEXception(int accno) {
		this.accno=accno;
	}
	@Override
	public String toString() {
		return "Accno :"+accno+" is not found";
	}
	
}
