package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;
public class Lab25 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		OracleDataSource ods=null;
		try{
			ods=new OracleDataSource();
			ods.setUser("system");
			ods.setPassword("jlcindia");
			ods.setURL("jdbc:oracle:thin:@localhost:1521:XE");
			con=ods.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from jlcstudents");
			if(rs.next()){
				do{
					int id=rs.getInt("sid");
					String nm=rs.getString("sname");
					System.out.println(id+"\t"+nm);
				}while(rs.next());
			}else {
				System.out.println("No Recors found");
			}
		}catch(SQLException e){
			for (Throwable ex:e) {
				ex.printStackTrace();
				
			}
		}finally {
			try{
				if(rs!=null)
					rs.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
