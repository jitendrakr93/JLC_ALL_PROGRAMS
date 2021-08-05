package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Lab17 {

	public static void main(String[] args)throws Exception {
		Connection con=JDBCUtil.getMySqlConnection();
		DatabaseMetaData md=con.getMetaData();
		System.out.println("URL :"+md.getURL());
		System.out.println("User :"+md.getUserName());
		System.out.println("Major Version :"+md.getDatabaseMajorVersion());
		System.out.println("Minor Version :"+md.getDatabaseMinorVersion());
		System.out.println("Full Join :"+md.supportsFullOuterJoins());
		System.out.println("Product Name :"+md.getDatabaseProductName());
		System.out.println("Multiple RS :"+md.supportsMultipleOpenResults());
		System.out.println("DB :"+md.getDatabaseProductName());

	}

}
