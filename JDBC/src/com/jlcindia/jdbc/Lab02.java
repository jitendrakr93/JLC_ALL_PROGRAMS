package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab02 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "katmabahuarwa");
			String sql="select * from jlcstudents";
			st=con.createStatement();
			ResultSet res=st.executeQuery(sql);
			while(res.next()){
				int sid=res.getInt(1);
				String sname=res.getString(2);
				String semail=res.getString(3);
				long phone=res.getLong(4);
				System.out.println(sid+"\t"+sname+"\t"+semail+"\t"+phone);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try{
			if(con!=null)
				con.close();
			if(st!=null)
				st.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
