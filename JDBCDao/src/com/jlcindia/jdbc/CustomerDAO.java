package com.jlcindia.jdbc;

import java.util.List;

public interface CustomerDAO {
	public int addCustomer(CustomerTo cto);

	public int updateCustomer(CustomerTo cto);

	public int deleteCustomer(int cid);

	public CustomerTo getCustomerByCid(int cid);

	public CustomerTo getCustomerByEmail(String email);

	public List<CustomerTo> getAllCustomers();

	public List<CustomerTo> getCustomesrByCity(String city);

	public List<CustomerTo> getCustomersByStatus(String status);

	public List<CustomerTo> getCustomersByBal(double bal);
}
