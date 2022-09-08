package com.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.bean.Register;
import com.dao.RegisterDAIO;
public class RegisterTester {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String jdbcURL = "jdbc:derby:testdb2;create=true";
		Connection connection = null;
		connection = DriverManager.getConnection(jdbcURL);
		System.out.println("The connection is established");
		
		RegisterDAIO dao=new RegisterDAIO();
		Scanner sc = new Scanner(System.in);
		
		dao.createTable(connection);
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1. Display\n2. Insert\n3. Delete\n4. Update");
			
			switch(Integer.parseInt(sc.nextLine()))
			{
				case 1: 
					dao.displayRecords(connection);
				break;
				
				case 2: 
					System.out.println("First name: ");
					String firstname = sc.nextLine();
					System.out.println("Last name: ");
					String lastname = sc.nextLine();
					System.out.println("Email id: ");
					String emailid = sc.nextLine();
					System.out.println("Phone number:");
					int phonenumber = Integer.parseInt(sc.nextLine());
					System.out.println("Shif starttime: ");
					String shiftstarttime = sc.nextLine();
					System.out.println("Shift endtime: ");
					String shiftendtime = sc.nextLine();
					System.out.println("No.of.Customers:");
					int customers = Integer.parseInt(sc.nextLine());
					System.out.println("Date: ");
					String date = sc.nextLine();
					Register r1 = new Register(firstname, lastname, emailid, phonenumber, customers, phonenumber, customers, date);
					dao.AddRegister(connection, r1);
				break;
				
				case 3:
					System.out.print("Enter your Phonenumber: ");
					phonenumber = Integer.parseInt(sc.nextLine());
					dao.deleteRegister(connection, phonenumber);
				break;	
				case 4:
					
					System.out.println("First name: ");
					String nfirstname = sc.nextLine();
					System.out.println("Last name: ");
					String nlastname = sc.nextLine();
					System.out.println("Email id: ");
					String nemailid = sc.nextLine();
					System.out.println("Phone number:");
					int nphonenumber = Integer.parseInt(sc.nextLine());
					System.out.println("Shif starttime: ");
					String nshiftstarttime = sc.nextLine();
					System.out.println("Shift endtime: ");
					String nshiftendtime = sc.nextLine();
					System.out.println("No.of.Customers:");
					int ncustomers = Integer.parseInt(sc.nextLine());
					System.out.println("Date: ");
					String ndate = sc.nextLine();
					
					dao.updateRegister(connection, nfirstname, nlastname, nemailid,  nphonenumber, nshiftstarttime, nshiftendtime , ncustomers, ndate);
					break;
					
				
					
			}
			
			System.out.println("Press e to exit!");
			if(sc.nextLine().equals("e"))
			{
				break;
			}
		}
		
		connection.close();

	}


}
