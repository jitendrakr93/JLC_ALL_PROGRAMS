package com.jlcindia.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.StringTokenizer;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab23 {

	public static void main(String[] args) {
		String fileName="D:\\JAVA\\FILES\\hello.jpg";
		String absFileName=fileName;
		StringTokenizer tok=new StringTokenizer(fileName,"\\");
		while(tok.hasMoreTokens())
			fileName=tok.nextToken();
		Connection con=null;
		PreparedStatement ps=null;
		FileInputStream fis=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			String sql="insert into datatable(name,data) values(?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, fileName);
			File image=new File(absFileName);
			fis=new FileInputStream(image);
			ps.setBinaryStream(2, fis,(int)image.length());
			ps.execute();
			System.out.println("Inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanUp(ps, con);
			if(fis!=null)
				try{
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
		

	}

}
