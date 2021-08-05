package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab04 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet res=null;
		try {
			con = JDBCUtil.getMySqlConnection();
			String sql = "select * from jlcstudents";
			st = con.createStatement();
			res = st.executeQuery(sql);
			while (res.next()) {
				int sid = res.getInt(1);
				String sname = res.getString(2);
				String semai = res.getString(3);
				long phone = res.getLong(4);
				System.out.println(sid + "\t" + sname + "\t" + semai + "\t" + phone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanUp(res, st, con);
		}
	}

}
