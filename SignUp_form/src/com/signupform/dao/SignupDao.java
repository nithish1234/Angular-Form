package com.signupform.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.signupform.model.SignUpmodel;
import com.signupformutil.java.SignUpUtil;

public class SignupDao {
	public void register(SignUpmodel signupmodel) {
		Connection conn = SignUpUtil.getConnection();
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(
					"INSERT INTO `form_detials`(firtname,lastname,mobile_number,email_id,password_name)VALUES(?,?,?)");
			pst.setString(1, "nithish");
			pst.setString(2, "bharath");
			pst.setInt(3, 909245806);
			pst.setString(4, "nithish");
			int i = pst.executeUpdate();
			System.out.println(i + "inserted record");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
