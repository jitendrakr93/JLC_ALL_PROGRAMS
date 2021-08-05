package com.jlcindia.transactionmanagement;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {
	}

	@Override
	public String toString() {
		return "Sufficient funds are not available";
	}
}
