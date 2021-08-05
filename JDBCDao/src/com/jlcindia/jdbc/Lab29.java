package com.jlcindia.jdbc;

import java.util.List;

public class Lab29 {

	public static void main(String[] args) {
		CustomerDAO cdao = DAOFactory.getCustomerDAO();
		// 1.Add Customer
		CustomerTo cto = new CustomerTo(101, "Vas", "vas@jlc", "888", "Delhi", 25000, "Inative");
		int x = cdao.addCustomer(cto);
		System.out.println(x);

		// 2.Update Customer
		cto = new CustomerTo(102, "vas", "vas@jlc.com", "1234", "Delhi", 35000, "Active");
		x = cdao.updateCustomer(cto);
		System.out.println(x);

		// 3.Delete Customer
		x = cdao.deleteCustomer(101);
		System.out.println(x);

		// 4.Get the Customer Info By Cid
		cto = cdao.getCustomerByCid(101);
		System.out.println(cto);
		cto = cdao.getCustomerByCid(102);
		System.out.println(cto);

		// 5.Get the Customer Info By Email
		cto = cdao.getCustomerByEmail("vas@jlc.com");
		System.out.println(cto);

		// 6.Get the Customer Info By All Customers
		System.out.println("------All Customers-----");
		List<CustomerTo> list = cdao.getAllCustomers();
		for (CustomerTo cto1 : list)
			System.out.println(cto1);

		// 7.Get the Customers Info By City
		System.out.println("----By City----------");
		list = cdao.getCustomersByStatus("Blore");
		for (CustomerTo cto1 : list)
			System.out.println(cto1);

		// 8.Get the Customers Info By Status
		System.out.println("-----By Status---------");
		list = cdao.getCustomersByStatus("Active");
		for (CustomerTo cto1 : list)
			System.out.println(cto1);

		// 9.Get the Customer Info By Bal
		System.out.println("------By Bal-------");
		list = cdao.getCustomersByBal(20000.0);
		for (CustomerTo cto1 : list)
			System.out.println(cto1);

	}

}
