package com.jlcindia.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JlcConfig {
	@Bean
	public DataSource oracleDS(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("katmabahuarwa");
		return ds;
	}
	
	@Bean
	public DataSource mysqlDS(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/jlcindiadb");
		ds.setUsername("root");
		ds.setPassword("katmabahuarwa");
		return ds;
	}
	
	@Bean(name="ts")
	public TestService testService(){
		return new TestService();
	}
}
