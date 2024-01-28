package pack2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
	private static  String Condatabase1="jdbc:mysql://localhost:3306/javadata_mohammed";
	private static  String Condatabase2="jdbc:mysql://localhost:3306/javadat_mohammed_ez";
	private static  String username="root";
	private static  String  password="";	
	public static Connection ConnDB(String str) throws SQLException {
		if(str.equals("data1")) {
			return DriverManager.getConnection(Condatabase1, username, password);
		}else if(str.equals("data2")) {
			return DriverManager.getConnection(Condatabase2, username, password);
		}else {
			return null;
		}
}
//		switch(str) {
//		case "data1": return DriverManager.getConnection(Condatabase1, username, password);
//		case "data2": return DriverManager.getConnection(Condatabase1, username, password);
//		default : return null;
//}
//		
//	}
	
}
