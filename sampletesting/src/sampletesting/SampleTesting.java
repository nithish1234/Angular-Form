package sampletesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class SampleTesting {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");
			//
			// PreparedStatement stmt=con.prepareStatement("insert into
			// form_detials(firtname,lastname,mobile_number,email_id,password_name)
			// values(?,?,?,?,?)");
			// stmt.setString(1,"nithish1");
			// stmt.setString(2, "bharath1");
			// stmt.setInt(3,909245801);
			// stmt.setString(4,"nithish1@gmail.com" );
			// stmt.setString(5,"nithish1");
			//
			// int i=stmt.executeUpdate();
			// System.out.println(i+" records inserted");
			// }
			// catch(Exception e){ System.out.println(e);}

			// PreparedStatement pst= con.prepareStatement("update form_detials set
			// firtname=? , lastname=? where id=?");
			// pst.setString(1,"joshua");
			// pst.setString(2,"mannual");
			// pst.setInt(3, 2);
			// int i=pst.executeUpdate();
			// System.out.print(i + "updated column");
			PreparedStatement pst = con.prepareStatement(
					"SELECT id ,firtname,lastname,mobile_number,email_id,password_name FROM form_detials");
			ResultSet rs = pst.executeQuery();
			

			while (rs.next()) {
				int id = rs.getInt("id");

				String firstname = rs.getString("firtname");
				String lastname = rs.getString("lastname");
				int mobilenumber = rs.getInt("mobile_number");
				String email_id = rs.getString("email_id");
				String password = rs.getString("password_name");
				System.out.print(" " + id);
				System.out.print(" " +" "+" "+ firstname);
				System.out.print(" " +" "+" "+ lastname);
				System.out.print(" " +" "+" "+ mobilenumber);
				System.out.print(" " +" "+" "+ email_id);
				System.out.print(" " +" "+" "+ password);

				System.out.println("");
				

				// System.out.println("id"+" "+"fisrtname"+" "+"lastname"+" "+"mobilenumber"+"
				// "+"email_id"+" "+"password");

			}
			// PreparedStatement pst=con.prepareStatement("delete from form_detials where
			// id=?");
			// pst.setInt(1,3);
			// int i =pst.executeUpdate();
			// System.out.println(i+ "rows deleted ");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// }
