package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab18 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from jlcstudents");
			ResultSetMetaData md=rs.getMetaData();
			int cols=md.getColumnCount();
			System.out.println("Columns :"+cols);
			for(int i=1;i<=cols;i++){
				String colNm=md.getColumnName(i);
				String clsNm=md.getColumnClassName(i);
				String tabNm=md.getTableName(i);
				String nm=md.getColumnTypeName(i);
				int size=md.getPrecision(i);
				System.out.println(colNm+"\t\t"+clsNm+"\t\t"+tabNm+"\t\t"+nm+"\t\t"+size);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(rs, st, con);
		}

	}

}
