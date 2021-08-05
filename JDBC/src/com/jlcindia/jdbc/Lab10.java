package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab10 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			//con=JDBCUtil.getOracleConnection();
			String qry=null;
			//qry="insert into jlcstudents values(94,'Kumar','Kumar@jlc.com',9494949494)";
			qry="update jlcstudents set phone=909090909090";
			//qry="select * from jlcstudents";
			ps=con.prepareStatement(qry);
			boolean b1=ps.execute();
			if(b1){
				rs=ps.getResultSet();
				if(rs.next()){
					do{
						int sid=rs.getInt(1);
						String nm=rs.getString(2);
						String em=rs.getString(3);
						long phn=rs.getLong(4);
						System.out.println(sid+"\t"+nm+"\t"+em+"\t"+phn);
					}while(rs.next());
				}else{
					int x=ps.getUpdateCount();
					System.out.println("Result :"+x);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(rs, ps, con);
		}

	}

}
