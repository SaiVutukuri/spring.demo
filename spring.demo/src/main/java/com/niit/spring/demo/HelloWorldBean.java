package com.niit.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldBean {
public static void main(String[] args) {
	//XML BASED APPROACH
	ApplicationContext ac=new FileSystemXmlApplicationContext("classpath:resources/spring.xml");
	  HelloWorld hw=(HelloWorld)ac.getBean("hello");
	  System.out.println("*****************XML BASED APPROACH*******************");
	  System.out.println(hw);
	  System.out.println(hw.sayHello());
	
	//code to check to prototype scope
    HelloWorld hw1=(HelloWorld)ac.getBean("hello");
	System.out.println(hw1);
	System.out.println(hw1.sayHello());
    DatabaseConnection db=(DatabaseConnection)ac.getBean("db");
	System.out.println("URL FOR ORACLE:"+db.getUrl());
	System.out.println("DRIVER CLASS NAME FOR ORACLE:"+db.getDrivername());
	System.out.println("USERNAME FOR ORACLE:"+db.getUsername());
	System.out.println("PASSWORD FOR ORACLE:"+db.getPassword());
  
	/*//ANNOTATION BASED APPROACH
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
	ac.register(ConfigurationClass.class);
	ac.refresh();
	HelloWorld hw1=(HelloWorld)ac.getBean("helloWorld");
	System.out.println("*****************ANNOTATION BASED APPROACH*******************");
	  System.out.println(hw1);
	  System.out.println(hw1.sayHello());
	  DatabaseConnection db1=(DatabaseConnection)ac.getBean("databaseConnection");
		System.out.println("URL FOR ORACLE:"+db1.getUrl());
		System.out.println("DRIVER CLASS NAME FOR ORACLE:"+db1.getDrivername());
		System.out.println("USERNAME FOR ORACLE:"+db1.getUsername());
		System.out.println("PASSWORD FOR ORACLE:"+db1.getPassword());*/
	
}
}
