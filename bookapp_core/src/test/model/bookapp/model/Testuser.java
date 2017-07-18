package test.model.bookapp.model;

import model.bookapp.model.User;

public class Testuser {
	public static void main(String[] args) {
		User user=new User();
	           user.setId(1);
	           user.setName("nithish");
	           user.setEmail_id("nithish.619@gmail.com");
	           user.setPassword("Pass123$");
	           System.out.println(user);
	            
	}

}
