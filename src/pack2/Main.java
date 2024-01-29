package pack2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	static Connection con=null;
	static Statement stat=null;
	static ResultSet result=null;
	public static void main(String[] args) throws SQLException  {
		
		try {
			con = Database.ConnDB("data1");
			System.out.println("Connected!");
			stat=con.createStatement();
			result=stat.executeQuery("select * from user");
			while(result.next()) {
				System.out.println("id="+result.getInt(1)+" name="+result.getString(2)+" prenom="+result.getString(3));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
		finally {
			if(con!=null) {
				con.close();
			}
			if(stat!=null) {
				stat.close();
			}
			if(result!=null) {
				result.close();
			}
		}
	
	}
}
