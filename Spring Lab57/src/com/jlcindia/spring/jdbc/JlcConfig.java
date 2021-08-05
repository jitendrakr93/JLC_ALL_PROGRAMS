package com.jlcindia.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.jlcindia.spring.jdbc"})
public class JlcConfig {

		@Bean
		public DataSource mysqlIDS(){
			DriverManagerDataSource ds=new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/jlcindiadb");
			ds.setUsername("root");
			ds.setPassword("katmabahuarwa");
			return ds;
		}
		
		@Bean
		public JdbcTemplate jdbcTemplate(DataSource dataSource){
			return new JdbcTemplate(dataSource);
		}
}
