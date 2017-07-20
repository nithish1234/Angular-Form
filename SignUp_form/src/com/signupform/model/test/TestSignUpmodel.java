package com.signupform.model.test;

import com.signupform.model.SignUpmodel;

public class TestSignUpmodel {

	public static void main(String[] args) {
		
		SignUpmodel signupmodel=new SignUpmodel();
		signupmodel.setId(1);
		signupmodel.setFirstname("nithish");
		signupmodel.setLastname("bharath");
		signupmodel.setEmail_id("nithish.619@gmail.com");
		signupmodel.setMobilenumber(909245806);
		signupmodel.setPassword("nithish");
		signupmodel.setConfirmpassword("nithish");
		System.out.println(signupmodel);
		
	}

}
