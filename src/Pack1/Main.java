package Pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection con=DataBse.ConnDB();
		if(con==null) {
			System.out.println(" Not connected Connected");
		}
		else {
			System.out.println("Connected");
		}
		Statement stmt=con.createStatement();
		String sql="select * from user";
		ResultSet rest=stmt.executeQuery(sql);
		while(rest.next()) {
			System.out.println(rest.getInt(1)+" "+rest.getString(2)+" "+rest.getString(3));
		}
	}
}
