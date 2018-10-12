package com.niit.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
@Bean (name="helloWorld")
public HelloWorld helloWorld()
{
	return(new HelloWorld());
}
@Bean
public DatabaseConnection databaseConnection()
{
	DatabaseConnection db=new DatabaseConnection();
	db.setDrivername("oracle.jdbc.driver.OracleDriver");
	db.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	db.setUsername("system");
	db.setPassword("manager");
	return db;
}
}
