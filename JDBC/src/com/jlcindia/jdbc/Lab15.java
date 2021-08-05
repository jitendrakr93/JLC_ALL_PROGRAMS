package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab15 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getOracleConnection();
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from jlcstudents");
			
			System.out.println("***Forward Direction***");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			
			System.out.println("***REVERSE DIRECTION***");
			while(rs.previous()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			
			System.out.println("**1st Record**");
			rs.first();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			
			System.out.println("**Last Record**");
			rs.last();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			
			System.out.println("**4th Record**");
			rs.absolute(4);
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			
			System.out.println("**From 4th next 2nd Record**");
			rs.relative(2);
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(rs, st, con);
		}

	}

}
