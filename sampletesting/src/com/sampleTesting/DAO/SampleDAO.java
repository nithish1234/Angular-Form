package com.sampleTesting.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;

public class SampleDAO {
	public static void main(String args[]) throws Exception {

		intial();

	}

	static void intial() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Insert Operation-1");
		System.out.println("Update Operation-2");
		System.out.println("Delete Operation-3");
		System.out.println("Select Operation-4");
		System.out.println("select Operation");

		int selectoperation = Integer.parseInt(br.readLine());
		if (selectoperation == 1) {
			Insert();
		} else if (selectoperation == 2) {
			update();
		} else if (selectoperation == 3) {
			delete();
		} else if (selectoperation == 4) {
			select();
		}

	}

	static void Insert() {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");

			PreparedStatement stmt = con.prepareStatement(
					"insert into form_detials(firtname,lastname,mobile_number,email_id,password_name) values(?,?,?,?,?)");

			System.out.println("enter your first name");
			String firstname = br.readLine();

			System.out.println("enter your last name");
			String lastname = br.readLine();
			System.out.println("enter your phone number");
			int mobilenumber = Integer.parseInt(br.readLine());
			System.out.println("enter your email_id");
			String email_id = br.readLine();
			System.out.println("enter your password");
			String password = br.readLine();

			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			stmt.setInt(3, mobilenumber);
			stmt.setString(4, email_id);
			stmt.setString(5, password);

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
			System.err.println(firstname + " " + lastname + " " + mobilenumber + " " + email_id + " " + password);
			insert();
		

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	static void insert() {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Insert another record yes or no ");
		String answer;
		try {
			answer = br.readLine();
			if (answer.equals("yes")) {
				Insert();
			} else {

				intial();

			}
			;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void update() {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");
			PreparedStatement pst = con.prepareStatement("update form_detials set firtname=? , lastname=? where id=?");
			System.out.println("for which user id records has to be done ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("enter your first name");
			String firstname = br.readLine();
			System.out.println("enter your last name");
			String lastname = br.readLine();
			if(lastname==null||!(lastname==null)) {

			pst.setString(1, firstname);
			pst.setString(2, lastname);
			pst.setInt(3, id);
			int i = pst.executeUpdate();
			if(i==0) {
				System.out.println("id with row dsnt exist");
				intial();
			}
			else {
			System.out.print(i + "updated column");
			System.out.println(firstname + ""+lastname);
			sampleforUpdate();
			}
			
		
			}
			
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	static void sampleforUpdate() {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("update another record yes or no ");
		String answer;
		try {
			answer = br.readLine();
			if (answer.equals("yes")) {
				update();
			} else {
				intial();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void delete() {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");
			PreparedStatement pst = con.prepareStatement("delete from form_detials where id=?");
			System.out.println("provide row id to delete");
			int id = Integer.parseInt(br.readLine());
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			
			
			if (i==0) {
				System.out.println("such row dsnt exists");
				intial();
			}
			else {
				System.out.println("row deleted");
			samplefordelete();}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	static void samplefordelete() {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("delete another record yes or no ");
		String answer;
		try {
			answer = br.readLine();
			if (answer.equals("yes")) {
				delete();
			} else if (answer.equals("no")) {
				intial();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void select() {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_database", "root",
					"Pass123$");

			PreparedStatement pst = con.prepareStatement("select * from form_detials");

			ResultSet rs = pst.executeQuery();
			System.out.println("id" + " " + "fname" +" "+ "lname"+ " "+"mobile"+" "+" "+"email"+" "+"password");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------");

			while (rs.next()) {
				int id=rs.getInt("id");
				String firstname=rs.getString("firtname");
				String lastname=rs.getString("lastname");
				int  mobilenumber=rs.getInt("mobile_number");
				String email_id=rs.getString("email_id");
				String password=rs.getString("password_name");
				System.out.print(" "+" "+" "+ id);
				System.out.print(" "+" "+" "+ firstname);
				System.out.print(" "+" "+" "+ lastname);
				System.out.print(" "+" "+" "+ mobilenumber);
				System.out.print(" "+" "+" "+email_id);
				System.out.print(" "+" "+" "+ password);
				System.out.println("");
				

			}
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------");
			sampleforselect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

	
	static void sampleforselect() {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("select another record another record yes or no ");
		String answer;
		try {
			answer = br.readLine();
			if (answer.equals("yes")) {
				select();
			} else if (answer.equals("no")) {
				intial();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}