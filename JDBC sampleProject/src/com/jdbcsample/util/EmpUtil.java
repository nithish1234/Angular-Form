package com.jdbcsample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmpUtil {
	public static void main(String args[]) throws ClassNotFoundException{
	 
		
		try {
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	   		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sample", "root", "Pass123$");
	   	       Statement  smt=con.createStatement();
	   	    ResultSet rs= smt.executeUpdate("INSERT INTO users(NAME , email_id , PASSWORD)\r\n" + "VALUES(?,?,?)");
				System.out.println(rs);

//			if (rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+"" +rs.getInt(3));
//				con.close();
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  

}
