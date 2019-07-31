package com.cts.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountRepo {

	public static void main(String[] args) {

			
//			1. Load the driver class
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			2. Get Connection to dB
			Connection con = null;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cogdb", "root", "rootroot");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			3. Create a statement 
			Statement stmt = null;
			try {
				stmt = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			4. Write a query & extract result set
			ResultSet rs = null;
			try {
				rs = stmt.executeQuery("select * from Account");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while (rs.next())
					System.out.println(rs.getInt(1) + "  " + rs.getDouble(2) + "  " + rs.getString(3));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
}
