package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsUtils {

	private static Connection con;

	private ConnectionsUtils() {
	}

	public static Connection getConnection(String url, String userName, String password) {
		try {
			// if (con == null) {
	     Class.forName("oracle.jdbc.OracleDriver");

			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Successfull..." + con);
			// } else {
			System.out.println("Old connection retrun..." + con);
			// }
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
