package Pack8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

import Pack3.DataBase;

public class Main {

	public static void main(String[] args) throws SQLException  {

		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadat_mohammed_ez", "root", "");
			System.out.println("Connected");
			Statement s=con.createStatement();
			String sql=" CREATE TABLE MOHAMMED(ID INT,NOM VARCHAR(255))";
			int res=s.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
	}
}
