package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	
	
	public static boolean updateStudent(Student st, int userID) {
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "update students set s_name=?, s_phone=?, s_city=? where s_id=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			pstmt.setInt(4, userID);
			
			pstmt.executeUpdate();
			f=true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	
	
	
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
			// jdbc code
			Connection con = CP.createC();
			String q="insert into students(s_name,s_phone,s_city) values(?,?,?)";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the values of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
	
			// execute
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	

	public static boolean deleteStudent(int userID) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			// jdbc code
			Connection con = CP.createC();
			String q="delete from students where s_id=?";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the values of parameter
			
			pstmt.setInt(1, userID);
			
			// execute
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	

	
	public static void showAllStudent() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			// jdbc code
			Connection con = CP.createC();
			String q="select * from students";
			// Statement
			Statement stmt = con.createStatement();
			
			// set the values of parameter
			
			ResultSet set = stmt.executeQuery(q);
			
			
		 while(set.next()) {
			 int id = set.getInt(1);
			 String name = set.getString(2);
			 String phone = set.getString(3);
			 String city = set.getString("s_city");
			 		
			 System.out.println("ID: " + id);
			 System.out.println("Name: " + name);
			 System.out.println("Number: " + phone);
			 System.out.println("City: " + city);
			 System.out.println("-----------------------");
			 
		 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

    
	
	
}


