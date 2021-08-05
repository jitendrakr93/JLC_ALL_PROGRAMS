package com.jlcindia.jdbc;

public class DAOFactory {
	static CustomerDAO customerDAO;
	static {
		customerDAO = new JdbcCustomerDAO();
	}

	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

}
