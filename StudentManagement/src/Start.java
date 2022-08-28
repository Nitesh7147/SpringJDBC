import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
         System.out.println("Welcome to Student Manage App");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         while(true) {
    	     System.out.println("Press 1 for ADD student");
    	     System.out.println("Press 2 for DELETE student");
    	     System.out.println("Press 3 for DISPLAY student");
    	     System.out.println("Press 4 for UPDATE student");
    	     System.out.println("Press 5 to EXIT app");
    	     
    	     int choice = Integer.parseInt(br.readLine());
    	     
    	     if(choice==1) {
    	    	 // add student code
    	    	 System.out.println("Enter user name");
    	    	 String name = br.readLine();
    	    	 
    	    	 System.out.println("Enter user phone");
    	    	 String phone = br.readLine();
    	    	 
    	    	 System.out.println("Enter user city");
    	    	 String city = br.readLine();
    	    	 
    	    	 // create student object to store student
    	    	 Student st = new Student(name,phone,city);
    	    	 boolean answer = StudentDao.insertStudentToDB(st);
    	    	 
    	    	 if(answer) {
    	    		 System.out.println("Student added successfully");
    	    	 }else {
    	    		 System.out.println("Something went wrong");
    	    	 }
    	    	 System.out.println(st);
    	    	 
    	    	 
    	    	 
    	    	 
    	    	 
    	     }else if(choice==2) {
    	    	 // delete student code
    	    	 System.out.println("Enter student id to delete");
    	    	 int userID = Integer.parseInt(br.readLine());
    	    	 
    	    	 boolean answer = StudentDao.deleteStudent(userID);
    	    	 
    	    	 if(answer) {
    	    		 System.out.println("Student deleted successfully");
    	    	 }else {
    	    		 System.out.println("Something went wrong");
    	    	 }
    	    	 
    	    	
    	    	 
    	     }else if(choice==3) {
    	    	 //display student code
    	    	 
    	    	 StudentDao.showAllStudent();
    	    	 
    	     }else if(choice==4){
    	    	 // update
    	    	 System.out.println("Enter student id to update details");
    	    	 int userID = Integer.parseInt(br.readLine());
    	    	 
    	    	 System.out.println("Enter user name");
    	    	 String name = br.readLine();
    	    	 
    	    	 System.out.println("Enter user phone");
    	    	 String phone = br.readLine();
    	    	 
    	    	 System.out.println("Enter user city");
    	    	 String city = br.readLine();
    	    	 
    	    	 Student st = new Student(name,phone,city);
    	    	 boolean answer = StudentDao.updateStudent(st,userID);
    	    	 
    	    	 if(answer) {
    	    		 System.out.println("Student updated successfully");
    	    	 }else {
    	    		 System.out.println("Something went wrong");
    	    	 }
    	    	 System.out.println(st);
    	    	 
    	    	 
    	    	 
    	     }else if(choice==5) {
    	    	 // exit
    	    	 break;
    	    	 
    	    	 
    	    	 
    	     }
    	     else {
    	     }
    	     
    	     
    	     
    	     
         }
         
         System.out.println("Thank-You");
	}

}
