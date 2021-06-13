package com.Dao1;

import java.sql.Connection;
import java.sql.SQLException;

import com.util.ConnectionsUtils;

public abstract class GenericDao1 {
	public Connection con;
	public void getConnection() {
		con = ConnectionsUtils.getConnection("jdbc:oracle:thin:@//LAPTOP-3QBQJ02T:1521/XE","system","tanya");
	}
 
	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
