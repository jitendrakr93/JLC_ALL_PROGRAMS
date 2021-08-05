package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab22 {

	public static void main(String[] args) {
		int sid=98;
		int d=25;
		int m=12;
		int y=2015;
		Date dt=new Date(y-1900,m-1,d);
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			ps=con.prepareStatement("insert into datetest values(?,?)");
			ps.setInt(1, sid);
			ps.setDate(2, dt);
			ps.executeUpdate();
			System.out.println("Inserted");
			JDBCUtil.cleanUp(ps, con);
			ps=con.prepareStatement("select * from datetest");
			rs=ps.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				Date dop=rs.getDate(2);
				SimpleDateFormat f= new SimpleDateFormat("dd-MMMM-yyyy");
				String d1=f.format(dop);
				System.out.println(id+"\t"+d1);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(rs, ps, con);
		}

	}

}
