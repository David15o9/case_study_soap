package com.training.prodsvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnectiondb() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username="sys as sysdba";
		String password="Test1234";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con != null) {
			System.out.println("Connection Successfully");
		}
		else {
			System.out.println("Unable to connect");
		}
		return con;
	}
}
