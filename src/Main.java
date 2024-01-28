import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import dao.DBConnection;
public class Main {

	
	public static void main(String[] args) throws SQLException {
		Connection con=DBConnection.getConnection();
		if(con==null) {
			System.out.println("Connection failed");
		}
		else {
			System.out.println("Connection succes");
		}
		
	}
}
