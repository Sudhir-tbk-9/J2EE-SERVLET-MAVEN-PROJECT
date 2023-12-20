package com.qspyder.jdbc_Student_Registration.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
public class StudentConnection {

	public static Connection getStudentConnection() {
		
		try {
			
			Driver driver = new Driver() ;
			DriverManager.registerDriver(driver);
		
		String url = "jdbc:mysql://localhost:3306/servletstudent" ;
		String user = "root";
		String pass = "root";
		
		return DriverManager.getConnection(url ,user , pass);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

	