package Pack5;

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
				ResultSet result=stat.executeQuery("select * from employe");
			) {	
			System.out.println("Connected!");
			System.out.println("table employe:");		
//			readData(result);
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

	
	
	
	
	
	
	
	
	
	private static  void readData(ResultSet result) throws SQLException {
		while(result.next()) {	
			Double D=(double) result.getInt("salaire");
			NumberFormat nForm=NumberFormat.getCurrencyInstance();
			String s=nForm.format(D);
			StringBuilder str=new StringBuilder();
			str.append(result.getString("nom")+"->");
			str.append(result.getString("matricule")+"->");
			str.append(result.getString("fonction")+"->");
			str.append(result.getString("matr_sup")+"->");
			str.append(s+"->");
			str.append(result.getInt("Commission")+"DH"+"->");
			str.append(result.getInt("N_service"));
			str.append("\n------------------------------------------------------------");
			str.toString();
			System.out.println(str);
		}
	}
}
