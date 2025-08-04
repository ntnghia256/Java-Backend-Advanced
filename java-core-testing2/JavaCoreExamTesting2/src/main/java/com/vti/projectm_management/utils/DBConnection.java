package com.vti.projectm_management.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException {
		if (conn == null || conn.isClosed()) {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacore_finaltest_pj_management", "root", "root");
		}
		return conn;
	}
}
