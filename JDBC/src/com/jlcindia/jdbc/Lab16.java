package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab16 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getOracleConnection();
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select sid,sname,email,phone from jlcstudents");

			System.out.println("**ALL RECORDS**");
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getLong(4));
			}
			System.out.println("**INSERTING RECORD**");
			rs.moveToInsertRow();
			rs.updateInt(1, 999);
			rs.updateString(2, "DK");
			rs.updateString(3, "dk@jlc.com");
			rs.updateLong(4, 31903290);
			rs.insertRow();
			System.out.println("Record Inserted");

			System.out.println("**UPDATING 2nd RECORD");
			rs.absolute(2);
			rs.updateString(2, "Manish");
			rs.updateString(3, "manish@jlc.com");
			rs.updateLong(4, 41279999);
			rs.updateRow();
			System.out.println("Record Updated");

			System.out.println("DELETING 3RD RECORD");
			rs.absolute(3);
			rs.deleteRow();
			System.out.println("Record Deleted");
		} catch (Exception e) {

		} finally {
			JDBCUtil.cleanUp(st, con);
		}

	}

}
