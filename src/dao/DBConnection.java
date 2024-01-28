package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String HOST="127.0.0.1";
	private static final int PORT=3306;
	private static final String DB_NAME="JAVADATA_MOHAMMED";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	
	private static Connection connection;
	
	public static Connection getConnection(){
		 try {
//			 jdbc:mysql://localhost:3306/JAVADATA_MOHAMMED
			connection=DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", HOST,PORT,DB_NAME), USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return connection;
	}
}
