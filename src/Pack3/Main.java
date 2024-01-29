package Pack3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;



public class Main {
	public static void main(String[] args) throws SQLException  {

		try(
				Connection con=DataBase.ConnDB();
				Statement stat=con.createStatement();
				ResultSet result=stat.executeQuery("select * from employe");
			) {	
			System.out.println("Connected!");
			System.out.println("table employe:");
			
			while(result.next()) {	
				Double D=(double) result.getInt("salaire");
				NumberFormat nForm=NumberFormat.getCurrencyInstance();
				String s=nForm.format(D);
				System.out.print(result.getString("nom")+"->"+result.getString("matricule")+"->"+
				result.getString("fonction")+"->"+result.getString("matr_sup")+"->"+
				s+"->"+
				result.getInt("Commission")+"DH"+"->"+result.getInt("N_service")+"\n");
				System.out.println("------------------------------------------------------------");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
	}
}
