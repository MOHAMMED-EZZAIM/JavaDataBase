package Connected_dataBase;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
	static final String lieudatabase="jdbc:mysql://localhost:3306/javadata_mohammed";
	static final String username="root";
	static final String  password="";

	public static void main(String[] args) {
			try {			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadata_mohammed", "root", "");
				System.out.println("Connected!");
			} catch (Exception e) {
				System.out.println("not Connected!");
			}
			
			   
	}
}
