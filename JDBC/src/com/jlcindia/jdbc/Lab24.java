package com.jlcindia.jdbc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab24 {

	public static void main(String[] args) {
		String fileName="hello.jpg";
		Connection con=null;
		PreparedStatement ps=null;
		FileOutputStream fos=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			String sql="select name,data from datatable where name=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, fileName);
			ResultSet resultSet=ps.executeQuery();
			while(resultSet.next()){
				File image=new File("D:\\"+fileName);
				fos=new FileOutputStream(image);
				byte[] buffer=new byte[1];
				InputStream is=resultSet.getBinaryStream(2);
				while(is.read(buffer)>0){
					fos.write(buffer);
				}
			}
			System.out.println("File Accessed in D:\\"+fileName);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(ps, con);
			if(fos !=null)
				try{
					fos.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
