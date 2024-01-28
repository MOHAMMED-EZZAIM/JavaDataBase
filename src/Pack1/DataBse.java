package Pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBse {
	private static  String lieudatabase="jdbc:mysql://localhost:3306/javadata_mohammed";
	private static  String username="root";
	private static  String  password="";
	
	public static Connection ConnDB() throws SQLException {
		return DriverManager.getConnection(lieudatabase, username, password);
	}
}
