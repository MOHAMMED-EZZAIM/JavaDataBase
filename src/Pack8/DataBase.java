package Pack8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {	
	private static String ConnectData="jdbc:mysql://localhost:3306/avadat_mohammed_ez";
	private static String user="root";
	private static String pass="";
	public static Connection ConnDB() throws SQLException {
			return DriverManager.getConnection(ConnectData, user, pass);
		}
}