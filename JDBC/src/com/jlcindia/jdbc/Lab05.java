package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab05 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			//con=JDBCUtil.getOracleConnection();
			int sid=97;
			String nm="Manish";
			String em="manish@jlc.com";
			long phn=97979797L;
			String qry=String.format("insert into jlcstudents values(%d,'%s','%s',%d)",sid,nm,em,phn);
			System.out.println(qry);
			st=con.createStatement();
			int x=st.executeUpdate(qry);
			if(x == 1)
				System.out.println("Record Inserted Successfully");
			else
				System.out.println("No Record Found");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBCUtil.cleanUp(st, con);
		}
	}

}
