package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdemo {

	public static void main(String[] args) {
		
		//Step 1: Load and register JDBC driver
		
		String db_url="jdbc:mysql://localhost:3306/employee";
		String user="root";
		String pass="root";
		
		try {
		
			// Class.forName("com.mysql.cj.jdbc.Driver");  // used to connect JDBC driver
			//Step 2: Establish the connection 
		Connection connection=DriverManager.getConnection(db_url, user, pass);
		
		// Step 3: Check connection sucessfull.
				if(connection!=null) {
					
					System.out.println("Connection established");
				}
				
				else {
					
					System.out.println("Connection not established");
				}
		
				// Step 4: Perform operation
		Statement stmt = connection.createStatement();
		//String insert="insert into emptable(empname,dept,salary) values ('Prakash','Mentor',50000.00)";
		String update = "update emptable set empname='Akash' where empname='prakash'";
		String select="select * from emptable";
		
		// insertion
		stmt.executeUpdate(update);
		
		// selecting the data
		ResultSet rs = stmt.executeQuery(select);
		
		while(rs.next()) {
			
		System.out.println(rs.getInt("empid"));
		System.out.println(rs.getString("empname"));
		System.out.println(rs.getBigDecimal("salary"));
		}
		
		connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
