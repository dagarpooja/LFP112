package com.addressBookDataBase;

public class Constants {
	
	
	public static final String JDBC_STR = "jdbc:mysql://localhost:3306/Address_Book_Service";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	public static final String insert_Data = "insert into ADDRESSBOOK(firstName,lastName,Address,City,State,ZipCode,PHONENUMBER,Email,name,type) "
			+ " VALUES(?,?,?,?,?,?,?,?,?,?)";
	
	public static final String retrive_Data = "select * from ADDRESSBOOK";


}
