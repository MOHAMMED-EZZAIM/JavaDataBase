package Pack6;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
public class ClassRead {
	public static  void readData(ResultSet result) throws SQLException {
		int i=2;
		while(result.next()) {	
			i++;
			Double D=(double) result.getInt("salaire");
			NumberFormat nForm=NumberFormat.getCurrencyInstance();
			String s=nForm.format(D);
			StringBuilder str=new StringBuilder();
			str.append("N"+i+" :"+result.getString("nom")+"->");
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
