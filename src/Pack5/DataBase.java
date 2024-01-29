package Pack5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	private static  String Condatabase="jdbc:mysql://localhost:3306/javadat_mohammed_ez";
	private static  String username="root";
	private static  String  password="";		
	public static Connection ConnDB() throws SQLException {
			return DriverManager.getConnection(Condatabase, username, password);
		}
}