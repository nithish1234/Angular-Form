package com.signupform.testutil;

import java.sql.Connection;

import com.signupformutil.java.SignUpUtil;

public class TestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Connection connection =SignUpUtil.getConnection();
               System.out.println(connection);
	}

}
