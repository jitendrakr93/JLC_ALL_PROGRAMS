package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab03 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			//con=JDBCUtil.getOracleConnection();
			String sql="insert into jlcstudents values(101,'vas','vas@jlc',9898989898)";
			st=con.createStatement();
			int x=st.executeUpdate(sql);
			if(x==1){
				System.out.println("Record Inserted");
			}else{
				System.out.println("Record Not Inserted");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBCUtil.cleanUp(st, con);
		}

	}

}
