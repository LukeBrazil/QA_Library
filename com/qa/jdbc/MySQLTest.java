package com.qa.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class MySQLTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			String url = "jdbc:mysql://localhost:3306/world";
			Connection con = null;
			String username = "root"; 
			String password = "mysql";

			//Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection(url, username, password);
	        stmt = con.createStatement();
	        rs = stmt.executeQuery("SELECT * FROM city");
	        
	        while(rs.next()) {
	        	int id = rs.getInt("ID");
	        	String name = rs.getString("Name");
	        	String countryCode = rs.getString("CountryCode");
	        	String district = rs.getString("District");
	        	int population = rs.getInt("Population");
	        	String response = "ID: " + id
	        					 + " Name: " + name
	        					 + " Country Code: " + countryCode
	        					 + " district: " + district;
	        	System.out.println(response);
	        					
	        }
	        
	        if (con != null) { 
	        	
	        	System.out .println("Successfully connected to MySQL database test"); 
	        	}

	        
		} catch (SQLException ex) {
			System.out .println("An error occurred while connecting MySQL databse"); 
			ex.printStackTrace();

			
		}
	}
}