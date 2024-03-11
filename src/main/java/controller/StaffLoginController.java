package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
   

public class StaffLoginController {
	String email,pass;
	String dbUrl="jdbc:mysql://localhost:3306/staffdetails";
    String dbUname="root";
    String dbPassword="";
    String dbDriver="com.mysql.cj.jdbc.Driver";
	public StaffLoginController(String email,String pass){
		this.email=email;
		this.pass=pass;
	}
	public boolean toStore(){
		 Connection con = null;
	   		try{
	   			Class.forName(dbDriver);  //class not found exception
	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
	 			String sql = "select * from StaffInfo where email='"+email+"' and password='"+pass+"'";	 		
	 		  
	 			Statement s = con.createStatement();
	 			ResultSet rs=s.executeQuery(sql);
	 			
	 			if(rs.next()) {
	 				System.out.println(rs.getString(1));
	 				con.close();
	 				return true;
	 			}
	 			
	 			con.close();
	 		   	
			 }catch(Exception e){      
				e.printStackTrace();
			 }
	   		return false;
		
	}
	

}