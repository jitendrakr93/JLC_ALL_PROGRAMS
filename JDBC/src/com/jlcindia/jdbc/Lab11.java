package com.jlcindia.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab11 {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		try{
			int sid=97;
			con=JDBCUtil.getMySqlConnection();
			//con=JDBCUtil.getOracleConnection();
			cs=con.prepareCall("call updateStudentResult(?)");
			cs.setInt(1, sid);
			cs.execute();
			System.out.println("Procedure executed successfully");
		}catch(SQLException e){
			System.out.println("Error in calling Procedure");
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(cs, con);
		}
	}

}
