package com.jlcindia.jdbc;

import com.jlcindia.transactionmanagement.Account;

public class Lab20 {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.transfer(77, 88, 5000);
	}

}
