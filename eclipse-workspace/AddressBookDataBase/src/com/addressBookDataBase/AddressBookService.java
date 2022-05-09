package com.addressBookDataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {

	static AddressBookDb1 AddressBookDb1;

	Connection connection;
	Constants constants;

	List<Contact> contactList = new ArrayList<>();

	public AddressBookService() {
		constants = new Constants();
		AddressBookDb1 = AddressBookDb1.init();
		connection = AddressBookDb1.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addInsertContact() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------Add new contact-----------");
		try {
			PreparedStatement ps = connection.prepareStatement(Constants.insert_Data,Statement.RETURN_GENERATED_KEYS);

			System.out.println("Enter the first name : ");
			String firstName = sc.nextLine();
			ps.setString(1, firstName);
			System.out.println("Enter the last name : ");
			String lastName = sc.nextLine();
			ps.setString(2, lastName);
			System.out.println("Enter the address : ");
			ps.setString(3, sc.nextLine());
			System.out.println("Enter the city : ");
			ps.setString(4, sc.nextLine());
			System.out.println("Enter the state : ");
			ps.setString(5, sc.nextLine());
			System.out.println("Enter the zip code : ");
			ps.setInt(6, sc.nextInt());

			System.out.println("Enter the phone number : ");
			ps.setInt(7, sc.nextInt());

			System.out.println("Enter the email : ");
			ps.setString(8, sc.nextLine());

			System.out.println("Enter the name : ");
			ps.setString(9, sc.nextLine());

			System.out.println("Enter the type : ");
			ps.setString(10, sc.nextLine());

			int row = ps.executeUpdate();

			if (row > 0) {

				System.out.println("contact successfully insert: " + row);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public void retriveData() {
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st
					.executeQuery(constants.retrive_Data);

			while (rs.next()) {

				Contact model = new Contact();

				model.setFirstName(rs.getString("firstName"));
				model.setLastName(rs.getString("lastName"));
				model.setAddress(rs.getString("Address"));
				model.setCity(rs.getString("city"));
				model.setState(rs.getString("state"));
				model.setZipCode(rs.getInt("zipCode"));
				model.setPhoneNumber(rs.getInt("PHONENUMBER"));
				model.setEmail(rs.getString("email"));
				model.setName(rs.getString("name"));
				model.setType(rs.getString("type"));
				model.setId(rs.getInt("id"));




				contactList.add(model);
			}

			contactList.forEach(e -> {
				System.out.println("firstName : " + e.getFirstName());
				System.out.println("lastName: " + e.getLastName());
				
				System.out.println("Address : " + e.getAddress());
				System.out
						.println("City : " + e.getCity());
				System.out.println(
						"State : " + e.getState());
				System.out.println("ZipCode : "
						+ e.getZipCode());
				System.out.println("PHONRNUMBER : " +e.getPhoneNumber());
				System.out.println("Email : " +e.getEmail());
				System.out.println("name  : " +e.getName());
				System.out.println("type : " + e.getType());
				System.out.println("Id : " +e.getId());
				System.out.println(
						"------------------------------------------");
			});
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		AddressBookService ab = new AddressBookService();

		ab.addInsertContact();
		//ab.retriveData();
		try {
			AddressBookDb1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}