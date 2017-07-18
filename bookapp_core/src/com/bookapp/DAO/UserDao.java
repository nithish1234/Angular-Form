package com.bookapp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookapp_core.util.BookappUtil;

import model.bookapp.model.User;

public class UserDao {

	public void register(User user) {
		Connection connetion = BookappUtil.getConnection();
		PreparedStatement pst;

		try {
			pst = connetion.prepareStatement("INSERT INTO users(NAME , email_id , PASSWORD)\r\n" + "VALUES(?,?,?)");

			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail_id());
			pst.setString(3, user.getPassword());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public User login(User user) {
		Connection connection =BookappUtil.getConnection();
		PreparedStatement pst;
		User userObj=null;
		try {
			pst =connection.prepareStatement("SELECT id,NAME,email_id,PASSWORD FROM users WHERE email_id=? AND PASSWORD=?");
		
		    pst.setString(1,user.getEmail_id());
		    pst.setString(2,user.getPassword());
		   ResultSet rs= pst.executeQuery();
		    if (rs.next()) {// if it is matched column is created 
		    	 userObj=new User();
		    	userObj.setId(rs.getInt(1));
		    	userObj.setName(rs.getString(2));
		    	userObj.setEmail_id(rs.getString(3));
		    	userObj.setPassword(rs.getString(4));
		    }
// {Name:nithish email:ntihsish.619@gmail.com password:nihtish@123}
		 
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userObj;
	}
	
}
