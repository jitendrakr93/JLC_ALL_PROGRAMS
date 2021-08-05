package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab09 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			//con=JDBCUtil.getOracleConnection();
			int sid=96;
			String qry="select * from jlcstudents where sid=?";
			ps=con.prepareStatement(qry);
			ps.setInt(1, sid);
			rs=ps.executeQuery();
			if(rs.next()){
				int id=rs.getInt(1);
				String nm=rs.getString(2);
				String eml=rs.getString(3);
				long phn=rs.getLong(4);
				System.out.println(id+"\t"+nm+"\t"+eml+"\t"+phn);
			}else{
				System.out.println("Sorry, Student not found");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBCUtil.cleanUp(rs, ps, con);
		}

	}

}
