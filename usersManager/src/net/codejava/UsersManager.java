package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersManager {

	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/sample";
		String dbusername="root";
		String dbpassword="Vijaykumar@32";
		
		String fullname="caesar";
		String username="caesarkumar";
		String email="casear32@gmail.com";
		String password="caesar@45";
		
		
		
		try {
			Connection connection= DriverManager.getConnection(jdbcURL,dbusername,dbpassword);
//			String sql="INSERT INTO USERS (username,email,fullname,password)"
//					+"values(?, ?, ?, ?)";
////			Statement statement=connection.createStatement();
////			int update= statement.executeUpdate(sql);
////			System.out.println("Above are manually enter the values to execute");
////			System.out.println("below are manually enter the values to variables");
//			PreparedStatement statement=connection.prepareStatement(sql);
//			statement.setString(1, fullname);
//			statement.setString(2, username);
//			statement.setString(3, email);
//			statement.setString(4, password);
//			
//			int update=statement.executeUpdate();
//		
//			if(update>0) {
//				System.out.println("A new user has been updated sucessfully");
//			}
//			
//			
//			if(connection !=null) {
//				System.out.println("connected to the database");
//				connection.close();
//			}
		
			String  sql="select * from users";
			Statement statement =connection.createStatement();
			ResultSet result=statement.executeQuery(sql);
			
			while(result.next()) {
				int userid=result.getInt("userid");
				String User_name=result.getString("username");
				String pass_word=result.getString("password");
				String full_name=result.getString("fullname");
				String email_=result.getString("email");
				System.out.println(userid+"-"+User_name+"-"+pass_word+"-"+full_name+"-"+email);
				
			}
			
			
		}catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}
