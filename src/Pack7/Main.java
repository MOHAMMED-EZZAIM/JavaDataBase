package Pack7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

import Pack3.DataBase;

public class Main {

	public static void main(String[] args) throws SQLException  {

		try {
			Connection con=DataBase.ConnDB();
			Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stat.setMaxRows(4);
			//maximum de rows 4 rows
			ResultSet result=stat.executeQuery("select * from employe ");
			System.out.println("Connected!");
			System.out.println("table employe:");		
			ClassRead.readData(result);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
	}
}
