package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab06 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySqlConnection();
			// con=JDBCUtil.OracleConnection();
			int sid = 97;
			String qry = String.format("select * from jlcstudents where sid=%d", sid);
			st = con.createStatement();
			rs = st.executeQuery(qry);
			if (rs.next()) {
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				String eml = rs.getString(3);
				long phn = rs.getLong(4);
				System.out.println(id + "\t" + nm + "\t" + eml + "\t" + phn);
			} else {
				System.out.println("Sorry,Student not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanUp(rs, st, con);
		}
	}

}
