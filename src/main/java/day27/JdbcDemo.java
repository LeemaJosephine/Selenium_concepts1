package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String DB_URL = "jdbc:mysql://localhost:3306/test";
		 String USER = "root";
		 String PASS = "root";
		 
		 try {
			
			 //Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
			 
			 if(connection!=null) {
				 System.out.println("Connection established");
			 } else {
				 System.out.println("Connection failed");
			 }
			 
			 Statement stmt = connection.createStatement();
			 String query = "Select * from testtable";
			 //stmt.executeUpdate(query);
			 ResultSet rs = stmt.executeQuery(query);
			 
			 while(rs.next()) {
				 
				 System.out.println(rs.getInt("id"));
				 System.out.println(rs.getString("username"));
				 System.out.println(rs.getString("email"));
			 }
			 
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
