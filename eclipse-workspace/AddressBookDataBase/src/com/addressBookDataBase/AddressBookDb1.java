package com.addressBookDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.sql.Driver;



public  class AddressBookDb1 {

	private Connection connection;

	private static  AddressBookDb1 AddressBookDb1;

	private AddressBookDb1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(
					"JDBC Driver class is not found");
			e.printStackTrace();
		}
		listDrivers();
	}

	public static AddressBookDb1 init() {
		if (AddressBookDb1 == null) {
			AddressBookDb1 = new AddressBookDb1();
		}
		return AddressBookDb1;
	}

	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(
					Constants.JDBC_STR, Constants.USERNAME,
					Constants.PASSWORD);
			System.out
					.println("Connection is established.");
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(
					"Connection can not established.");
			return null;
		}
	}

	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void listDrivers() {
		Enumeration<Driver> drivers = DriverManager
				.getDrivers();

		while (drivers.hasMoreElements()) {

			Driver driver = drivers.nextElement();
			System.out.println(driver.getClass().getName());
		}
	}
}
