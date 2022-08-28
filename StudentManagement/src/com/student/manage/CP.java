package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;




public class CP {
	// CP -> Connection Provider
	
	static Connection con;
	// variable of connection type
	
	public static Connection createC() {
		// createC()  is a static method so it can be called by CP.createC()
		
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create the connection
			// to store connection make variable Connection con;
			
			
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String user = "root";
			String password = "12345";
			
			con = DriverManager.getConnection(url, user, password);
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
	}
}
