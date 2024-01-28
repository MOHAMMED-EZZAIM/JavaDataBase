package pack2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
		Connection con=Database.ConnDB("data1");
		Statement stat=con.createStatement();
		ResultSet result=stat.executeQuery("select * from user");
		while(result.next()) {
			System.out.println("id="+result.getInt(1)+" name="+result.getString(2)+" prenom="+result.getString(3));
		}
	}
}
