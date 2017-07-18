package test.com.bookapp.DAO;

import com.bookapp.DAO.UserDao;

import model.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) {
		User user = new User();
		//user.setName("spencer");
		user.setEmail_id("spencer@revature.com");
		user.setPassword("nithish@123");

		UserDao dao = new UserDao();

		//dao.register(user);
	User userr=dao.login(user);
	System.out.println(userr);
	}

}
