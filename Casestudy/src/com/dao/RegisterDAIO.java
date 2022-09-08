package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.Register;

public class RegisterDAIO {

		

		
		
		public void createTable(Connection connection) throws SQLException
		{
			String sql = "create table Register (firstname varchar(30), lastname varchar(30), emailid varchar(30), phonenumber int NOT NULL PRIMARY KEY, shiftstarttime int, shiftendtime int, customers int, date varchar(30) )";
			Statement stmt = connection.createStatement();
			
			stmt.execute(sql);
		}
		
		public int AddRegister(Connection connection, Register r) throws SQLException
		{
			int rows=0;
			String sql = "insert into Employee values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,r.getFirstname());
		    ps.setString(2, r.getLastname());
			ps.setString(3, r.getEmailid());
			ps.setInt(4, r.getPhonenumber());
			ps.setInt(5, r.getShiftstarttime());
			ps.setInt(6, r.getShiftendtime());
			ps.setInt(7, r.getCustomers());
			ps.setString(8, r.getDate());
		    rows=ps.executeUpdate();
			return rows;
		}
		
		public int updateRegister(Connection connection,String firstname,String lastname,String emailid,int phonenumber,int shiftstarttime,int shiftendtime,int customers,String date) throws SQLException
		{
			int updated=0;
			String sql="update Employee set firstname=?,lastname=?,emailid=?,shiftstarttime=?,shiftendtime=?,customers=?,date=? where phonenumber=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,firstname);
			ps.setString(2,lastname);
			ps.setString(3,emailid);
			ps.setInt(4,phonenumber);
			ps.setInt(5, shiftstarttime);
			ps.setInt(6, shiftendtime);
			ps.setInt(7, customers);
			ps.setString(8, date);
			updated=ps.executeUpdate();
			return updated;
			
			
		}
		
		public void deleteRegister(Connection connection, int phonenumber) throws SQLException
		{
			String sql = "delete from Register where phonenumber = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(4, phonenumber);
			pstmt.execute();
		}
		
		public void displayRecords(Connection connection) throws SQLException
		{
			String sql = "select firstname,lastname,emailid,phonenumber,shiftstarttime,shiftendtime,customers,date from Register";
			Statement stmpt = connection.createStatement();
			
			ResultSet resultObj = stmpt.executeQuery(sql);
			
			while(resultObj.next())
			{
				System.out.println(String.format("Firstname: %s", resultObj.getString("firstname")));
				System.out.println(String.format("Lastname: %s", resultObj.getString("lastname")));
				System.out.println(String.format("Emailid: %s", resultObj.getString("emailid")));
				System.out.println(String.format("Phonenumber: %d", resultObj.getInt("phonenumber")));
				System.out.println(String.format("Shiftstarttime: %d", resultObj.getInt("shiftstarttime")));
				System.out.println(String.format("Shiftendtime: %d", resultObj.getInt("shiftendtime")));
				System.out.println(String.format("Customers: %d", resultObj.getInt("customers")));
				System.out.println(String.format("Date: %s", resultObj.getString("date")));
			}
		}
		

	}


