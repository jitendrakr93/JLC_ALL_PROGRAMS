package com.jlcindia.jdbc;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;

public class Lab19 {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			CachedRowSet rs=new CachedRowSetImpl();
			rs.setUrl("jdbc:mysql://localhost:3306/university");
			rs.setUsername("root");
			rs.setPassword("katmabahuarwa");
			rs.setCommand("select sid,sname,email,phone from jlcstudents");
			rs.execute();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
			rs.absolute(1);
			rs.updateString(2,"Dande");
			rs.updateString(3, "dande@jlc.com");
			rs.updateLong(4, 31903290);
			rs.updateRow();
			//rs.acceptChanges();
			System.out.println("Updated");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
