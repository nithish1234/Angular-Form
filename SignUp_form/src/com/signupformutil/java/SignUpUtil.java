package com.signupformutil.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SignUpUtil {
public static Connection getConnection() {
	Connection connection=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root", "Pass123$");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}
}
