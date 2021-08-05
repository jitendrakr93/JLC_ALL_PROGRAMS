package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.jlcindia.jdbc.util.JDBCUtil;


public class Lab21 {

	public static void main(String[] args) {
		int sid=99;
		int d=25;
		int m=12;
		int y=2015;
		Date dt=new Date(y-1990,m-1,d);
		Connection con=null;
		Statement st=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			DatabaseMetaData md=con.getMetaData();
			String db=md.getDatabaseProductName();
			String dop="";
			System.out.println(db);
			if(db.equals("MySQL")){
				SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
				dop=f.format(dt);
			}
			st=con.createStatement();
			String sql=String.format("insert into datetest values(%d,'%s')", sid,dop);
			st.executeUpdate(sql);
			System.out.println("Inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(st, con);
		}

	}

}
