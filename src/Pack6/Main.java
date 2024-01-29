package Pack6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

import Pack3.DataBase;

public class Main {

	public static void main(String[] args) throws SQLException  {

		try(
				Connection con=DataBase.ConnDB();
				Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         	    //ResultSet result=stat.executeQuery("select * from employe LIMIT 4");
				//le but de LIMIT est red seulement les 4 liges de la table employe
//				ResultSet result=stat.executeQuery("select * from employe LIMIT 2,4");
				//start in indice 2 et affiche 4 rows
				ResultSet result=stat.executeQuery("select * from employe LIMIT 10,7 ");
			) {	
			System.out.println("Connected!");
			System.out.println("table employe:");		
			ClassRead.readData(result);
			result.first();
			System.out.println("firsname first personne:"+result.getString("nom"));
			result.last();
			System.out.println("firstName Last personne:"+result.getString("nom"));
			result.absolute(4);
			System.out.println("firsname row number 2 is :"+result.getString("nom"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
	}
}
