package com.bean;

public class Register {
     
	private String firstname;
	private String lastname;
	private String emailid;
	private int phonenumber;
	private int shiftstarttime;
	private int shiftendtime;
	private int customers;
	private String date;
	public Register(String firstname, String lastname, String emailid, int phonenumber, int shiftstarttime,
			int shiftendtime, int customers, String date) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.phonenumber = phonenumber;
		this.shiftstarttime = shiftstarttime;
		this.shiftendtime = shiftendtime;
		this.customers = customers;
		this.date = date;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getShiftstarttime() {
		return shiftstarttime;
	}
	public void setShiftstarttime(int shiftstarttime) {
		this.shiftstarttime = shiftstarttime;
	}
	public int getShiftendtime() {
		return shiftendtime;
	}
	public void setShiftendtime(int shiftendtime) {
		this.shiftendtime = shiftendtime;
	}
	public int getCustomers() {
		return customers;
	}
	public void setCustomers(int customers) {
		this.customers = customers;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
