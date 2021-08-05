package com.jlcindia.jdbc;

import java.util.List;

public class JdbcCustomerDAO implements CustomerDAO {

	@Override
	public int addCustomer(CustomerTo cto) {
		String sql = "insert into customers values(?,?,?,?,?,?,?)";
		return JdbcTemplate.update(sql, cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
				cto.getBal(), cto.getStatus());
	}

	@Override
	public int updateCustomer(CustomerTo cto) {
		String sql = "update customers set cname=?,email=?,phone=?,city=?,bal=?,status=? where cid=?";
		return JdbcTemplate.update(sql, cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(), cto.getBal(),
				cto.getStatus(), cto.getCid());
	}

	@Override
	public int deleteCustomer(int cid) {
		String sql = "delete from customers where cid=?";
		return JdbcTemplate.update(sql, cid);
	}

	@Override
	public CustomerTo getCustomerByCid(int cid) {
		String sql = "select * from customers where cid=?";
		Object obj = JdbcTemplate.queryForObject(sql, new CustomerRowMapper(), cid);
		CustomerTo cto = (CustomerTo) obj;
		return cto;
	}

	@Override
	public CustomerTo getCustomerByEmail(String email) {
		String sql = "select * from customers where email=?";
		Object obj = JdbcTemplate.queryForObject(sql, new CustomerRowMapper(), email);
		CustomerTo cto = (CustomerTo) obj;
		return cto;
	}

	@Override
	public List<CustomerTo> getAllCustomers() {
		String sql = "select * from customers";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper());
	}

	@Override
	public List<CustomerTo> getCustomesrByCity(String city) {
		String sql = "select * from customers where city=?";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper(), city);
	}

	@Override
	public List<CustomerTo> getCustomersByStatus(String status) {
		String sql = "select * from customers where status=?";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper(), status);
	}

	@Override
	public List<CustomerTo> getCustomersByBal(double bal) {
		String sql = "select * from customers where bal<=?";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper(), bal);
	}

}
