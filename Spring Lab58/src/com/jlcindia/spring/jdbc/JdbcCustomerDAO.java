package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO{

	@Autowired
	JdbcTemplate jdbcTemp;
	@Override
	public List<CustomerTO> getAllCustomers() {
		String sql="select * from customers";
		List list=jdbcTemp.query(sql, new CustomerRowMapper());
		return list;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String sql="select * from customers where cid=?";
		CustomerTO cto=(CustomerTO)jdbcTemp.queryForObject(sql, new CustomerRowMapper(),cid);
		return cto;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String sql="select * from customers where email=?";
		CustomerTO cto=(CustomerTO)jdbcTemp.queryForObject(sql, new CustomerRowMapper(),email);
		return cto;
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		String sql="select * from customers where city=?";
		List list=jdbcTemp.query(sql, new CustomerRowMapper(),city);
		return list;
	}

	@Override
	public int getCustomersCount() {
		String sql="select count(*) from customers";
		return jdbcTemp.queryForObject(sql, Integer.class);
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		String sql="select city from customers where email=?";
		String city=jdbcTemp.queryForObject(sql, String.class,email);
		return city;
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		String sql="select phone from customers where email=?";
		Long ph=(Long)jdbcTemp.queryForObject(sql, Long.class,email);
		return ph;
	}

}
