package test.bookapp_core.util;

import java.sql.Connection;

import com.bookapp_core.util.BookappUtil;

public class TestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  Connection connection  =BookappUtil.getConnection();
                  System.out.println(connection);
	} 

}
