package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab01 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "katmabahuarwa");
			String sql = "insert into jlcstudents values(990,'sri','sri@jlc',999999999)";
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if (x == 1) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Record Not Inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				if (st != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
