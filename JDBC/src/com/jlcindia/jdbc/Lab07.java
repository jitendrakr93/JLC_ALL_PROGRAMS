package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab07 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			//con=JDBCUtil.getOracleConnection();
			String qry=null;
			//qry="insert into jlcstudents values(96,'Dande','dande@jlc.com',9696969696)";
			qry="select * from jlcstudents";
			//qry="update jlcstudents set phone=9191919191";
			st=con.createStatement();
			boolean b1=st.execute(qry);
			if(b1){
				rs=st.getResultSet();
				if(rs.next()){
					do{
						int sid=rs.getInt(1);
						String nm=rs.getString(2);
						String em=rs.getString(3);
						long phn=rs.getLong(4);
						System.out.println(sid+"\t"+nm+"\t"+em+"\t"+phn);
					}while(rs.next());
				}else{
					int x=st.getUpdateCount();
					System.out.println("Result :"+x);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBCUtil.cleanUp(rs, st, con);
		}
	}

}
