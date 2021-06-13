package com.model;

public class Buyer {

	private String full_name;
	private long phone_no;
        private String email;
        private long aadhar_no;
        private long pincode;
	private String address;
	private String password;

    @Override
    public String toString() {
        return "Buyer{" + "full_name=" + full_name + ", phone_no=" + phone_no + ", email=" + email + ", aadhar_no=" + aadhar_no + ", pincode=" + pincode + ", address=" + address + ", password=" + password + '}';
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    
    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        

}