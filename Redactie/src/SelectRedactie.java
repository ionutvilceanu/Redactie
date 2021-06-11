import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRedactie {
	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
		String query = "SELECT * FROM Redactie";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		 while (rs.next())
	      {
	        int idRedactie = rs.getInt("idRedactie");
	        String TipRedactie = rs.getString("TipRedactie");
	        int NR_Ziaristi_Redactie = rs.getInt("NR_Ziaristi_Redactie");
	        System.out.format("%s, %s, %s\n", idRedactie, TipRedactie, NR_Ziaristi_Redactie);
	      }
		   st.close();
	    
		}
		catch(Exception e) {
			System.out.println("nu");
		}
	}
	


}
