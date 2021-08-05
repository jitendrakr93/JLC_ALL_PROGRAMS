package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getMySQLConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/university";
		Connection con = DriverManager.getConnection(url, "root", "12345");
		return con;
	}

	public static void cleanup(Connection con, Statement st) {
		try {
			if (con != null)
				con.close();
			if (st != null)
				st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			if (con != null)
				con.close();
			if (st != null)
				st.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
