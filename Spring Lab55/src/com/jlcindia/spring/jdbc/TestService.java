package com.jlcindia.spring.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class TestService {
	@Resource(name="oracleDS")
	private DataSource oracleDS;
	@Resource(name="mysqlDS")
	private DataSource mysqlDS;
	public void showOracleInfo(){
		try{
			Connection oracon=oracleDS.getConnection();
			DatabaseMetaData oradbmd=oracon.getMetaData();
			System.out.println(oradbmd.getDatabaseProductName());
			System.out.println(oradbmd.getDefaultTransactionIsolation());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void showMySQLInfo(){
		try{
			Connection oracon=mysqlDS.getConnection();
			DatabaseMetaData mydbmd=oracon.getMetaData();
			System.out.println(mydbmd.getDatabaseProductName());
			System.out.println(mydbmd.getDefaultTransactionIsolation());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
