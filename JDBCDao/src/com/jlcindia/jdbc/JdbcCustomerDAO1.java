package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcCustomerDAO1 implements CustomerDAO {

	@Override
	public int addCustomer(CustomerTo cto) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "insert into customers values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cto.getCid());
			ps.setString(2, cto.getCname());
			ps.setString(3, cto.getEmail());
			ps.setString(4, cto.getPhone());
			ps.setString(5, cto.getCity());
			ps.setDouble(6, cto.getBal());
			ps.setString(7, cto.getStatus());
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps);
		}
		return x;
	}

	@Override
	public int updateCustomer(CustomerTo cto) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "update customers set cname=?,email=?,phone=?,city=?,bal=?,status=? where cid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, cto.getCname());
			ps.setString(2, cto.getEmail());
			ps.setString(3, cto.getPhone());
			ps.setString(4, cto.getCity());
			ps.setDouble(5, cto.getBal());
			ps.setString(6, cto.getStatus());
			ps.setInt(7, cto.getCid());
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps);
		}
		return x;

	}

	@Override
	public int deleteCustomer(int cid) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "delete from customers where cid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps);
		}
		return x;
	}

	@Override
	public CustomerTo getCustomerByCid(int cid) {
		CustomerTo cto = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "slect * from customers where cid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			rs = ps.executeQuery();
			if (rs.next()) {
				cto = new CustomerTo();
				cto.setCid(rs.getInt(1));
				cto.setCname(rs.getString(2));
				cto.setEmail(rs.getString(3));
				cto.setPhone(rs.getString(5));
				cto.setCity(rs.getString(5));
				cto.setStatus(rs.getString(7));
				cto.setBal(rs.getDouble(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return cto;
	}

	@Override
	public CustomerTo getCustomerByEmail(String email) {
		CustomerTo cto = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select * from customers where email=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				cto = new CustomerTo();
				cto.setCid(rs.getInt(1));
				cto.setCname(rs.getString(2));
				cto.setEmail(rs.getString(3));
				cto.setPhone(rs.getString(5));
				cto.setCity(rs.getString(5));
				cto.setStatus(rs.getString(7));
				cto.setBal(rs.getDouble(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return cto;
	}

	@Override
	public List<CustomerTo> getAllCustomers() {
		List<CustomerTo> list = new ArrayList<CustomerTo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select * from customers";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerTo cto = new CustomerTo();
				cto.setCid(rs.getInt(1));
				cto.setCname(rs.getString(2));
				cto.setEmail(rs.getString(3));
				cto.setPhone(rs.getString(5));
				cto.setCity(rs.getString(5));
				cto.setStatus(rs.getString(7));
				cto.setBal(rs.getDouble(6));
				list.add(cto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<CustomerTo> getCustomesrByCity(String city) {
		List<CustomerTo> list = new ArrayList<CustomerTo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select * from customers where city=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, city);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerTo cto = new CustomerTo();
				cto.setCid(rs.getInt(1));
				cto.setCname(rs.getString(2));
				cto.setEmail(rs.getString(3));
				cto.setPhone(rs.getString(5));
				cto.setCity(rs.getString(5));
				cto.setStatus(rs.getString(7));
				cto.setBal(rs.getDouble(6));
				list.add(cto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<CustomerTo> getCustomersByStatus(String status) {
		List<CustomerTo> list = new ArrayList<CustomerTo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select * from customers where status=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, status);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerTo cto = new CustomerTo();
				cto.setCid(rs.getInt(1));
				cto.setCname(rs.getString(2));
				cto.setEmail(rs.getString(3));
				cto.setPhone(rs.getString(5));
				cto.setCity(rs.getString(5));
				cto.setStatus(rs.getString(7));
				cto.setBal(rs.getDouble(6));
				list.add(cto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<CustomerTo> getCustomersByBal(double bal) {
		List<CustomerTo> list = new ArrayList<CustomerTo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "select * from customers where bal<=?";
			ps = con.prepareStatement(sql);
			ps.setDouble(1, bal);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerTo cto = new CustomerTo();
				cto.setCid(rs.getInt(1));
				cto.setCname(rs.getString(2));
				cto.setEmail(rs.getString(3));
				cto.setPhone(rs.getString(5));
				cto.setCity(rs.getString(5));
				cto.setStatus(rs.getString(7));
				cto.setBal(rs.getDouble(6));
				list.add(cto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return list;
	}

}
