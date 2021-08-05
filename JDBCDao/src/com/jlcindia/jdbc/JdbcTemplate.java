package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
	public static int update(String sql, Object... args) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps);
		}
		return x;
	}

	public static Object queryForObject(String sql, RowMapper mapper, Object... args) {
		Object obj = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();
			if (rs.next()) {
				obj = mapper.mapRow(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return obj;
	}

	public static List queryForList(String sql, RowMapper mapper, Object... args) {
		List list = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				Object obj = mapper.mapRow(rs);
				list.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(con, ps, rs);
		}
		return list;
	}

}
