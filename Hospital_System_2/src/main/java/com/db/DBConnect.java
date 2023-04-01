package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
private static Connection conn;
	
	public static Connection getConn() {
		
		
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//get connection
			
			
			String url="jdbc:mysql://localhost:3306/hospital_2";
			String userName="root";
			String password="bish@l961";
			
			conn=DriverManager.getConnection(url, userName, password);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return conn;
		
	}

}
