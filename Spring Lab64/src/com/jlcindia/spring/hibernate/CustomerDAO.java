package com.jlcindia.spring.hibernate;

import java.util.List;

public interface CustomerDAO {
	public List<CustomerTO> getAllCustomers();
	public CustomerTO getCustomerByEmail(String email);
	public List<CustomerTO> getCustomersByCity(String city);
	public int getCustomersCount();
	public String getCustomerCityByEmail(String email);
	public long getCustomerPhoneByEmail(String email);
}
