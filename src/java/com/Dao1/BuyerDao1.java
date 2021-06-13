package com.Dao1;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Buyer;

public class BuyerDao1 extends GenericDao1 {

	public BuyerDao1() {
		getConnection();
	}

	public String insertBuyer(Buyer buyer) {
		String sql = "insert into BUYER(FULL_NAME, PHONE_NO, EMAIL , AADHAR_NO, PINCODE, ADDRESS, PASSWORD) values(?, ?, ?, ?, ?, ?, ?)";
		String result = "";
		PreparedStatement ps = null;
		try {
			System.out.println(con);
			ps = con.prepareStatement(sql);
			int parameterIndex = 0;
			
			ps.setString(++parameterIndex, buyer.getFull_name());
                        ps.setLong(++parameterIndex, buyer.getPhone_no());
			ps.setString(++parameterIndex, buyer.getEmail());
                        ps.setLong(++parameterIndex, buyer.getAadhar_no());
			ps.setLong(++parameterIndex, buyer.getPincode());
			ps.setString(++parameterIndex, buyer.getAddress());
                         ps.setString(++parameterIndex, buyer.getPassword());
			
			
			int i = ps.executeUpdate();
			if (i != 0) {
				result = "Record has been inserted";
			} else {
				result = "Failed to insert the data";
			}
		} catch (SQLException e) {
			result = "Failed to insert due to error";
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(result);
		System.out.println("---------------------------------------------------");
		return result;
	}

	public boolean validateUser(Buyer buyer) {
		String sql = "select * from BUYER where USERNAME = ? and PASSWORD = ?";
		try {
			System.out.println(con);
			PreparedStatement ps = con.prepareStatement(sql);
			int parameterIndex = 0;
			ps.setString(++parameterIndex, buyer.getEmail());
			ps.setString(++parameterIndex, buyer.getPassword());
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				if (rs.next()) {
					System.out.println("Buyer featched");
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
}


