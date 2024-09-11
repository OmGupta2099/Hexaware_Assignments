package com.java.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {

	private static Connection con;

	public DataConnect() {

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudDB", "root", "om03052003");
			System.out.println("DB Connected.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static Connection getConnect() {

		new DataConnect();
		return (con);

	}

}
