package com.controller1;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Dao1.BuyerDao1;
import com.model.Buyer;

@WebServlet("/BuyerRegistration")
public class BuyerRegistrationController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

        
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String full_name = req.getParameter("fname");
                String phone_no = req.getParameter("phn");
		String email = req.getParameter("email");
                String aadhar_no = req.getParameter("aadhar");
                String pincode = req.getParameter("pin");
                String address = req.getParameter("address");
                String password = req.getParameter("pwd");
		
		
		
		if (phone_no  == null || phone_no.equals("")) {
			phone_no = "0";
                }
		Long phone = Long.parseLong("phone_no");
                
                
                if (aadhar_no  == null || aadhar_no.equals("")) {
			aadhar_no = "0";
		}
		long aadhar = Long.parseLong(aadhar_no);
                
                if (pincode  == null || pincode.equals("")) {
			pincode = "0";
		}
		long pincod = Long.parseLong(pincode);
		
                
		
		
		Buyer buyer = new Buyer();
		
		buyer.setFull_name(full_name);
                buyer.setPhone_no(phone);
                buyer.setEmail(email);
                buyer.setAadhar_no(aadhar);
                buyer.setPincode(pincod);
                buyer.setAddress(address);
                buyer.setPassword(password);
                
		String result = "";
		BuyerDao1 dao1 = new BuyerDao1();
		result = dao1.insertBuyer(buyer);
		
			
		req.setAttribute("resultKey", result);
		RequestDispatcher rd = req.getRequestDispatcher("RegistrationSuccessful.jsp");
		rd.forward(req, resp);
	}

   

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}