package com.hexaware;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	public static Connection establishConnection() 
		throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/domaindb", 
				"root", "Password123");
		return con;
	}
}
