package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import Models.StaffSignUpModels;


public class StaffSignUpController {
	String name,email,designation,department,lectureTopic,phoneno;
	String dbUrl="jdbc:mysql://localhost:3306/StaffDetails";
    String dbUname="root";
    String dbPassword="";
    String dbDriver="com.mysql.cj.jdbc.Driver";
    StaffSignUpModels rm;
	public StaffSignUpController(StaffSignUpModels rm){
		this.rm=rm;
	}
	public void toStore(){
		Connection con = null;
   		try{
   			Class.forName(dbDriver);  //class not found exception
 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
 			String sql = "insert into StaffInfo (FullName,email,Password,Designation,Department,LectureTopic,PhoneNo,Availability)values('"+rm.getName()+"','"+rm.getEmail()+"','"+rm.getPass()+"','"+rm.getDesignation()+"','"+rm.getDepartment()+"','"+rm.getLectureTopic()+"','"+rm.getPhoneno()+"','"+rm.getAvail()+"')";
 			Statement s = con.createStatement();
 			s.execute(sql);
 		   	con.close();
		 }catch(Exception e){      
			e.printStackTrace();
		 }
	
	
	
	}

}