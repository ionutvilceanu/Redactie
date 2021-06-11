import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;


public class ConnectionMySQL { 
	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
		String query = "SELECT * FROM Ziarist";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		 while (rs.next())
	      {
	        int idZiarist = rs.getInt("idZiarist");
	        String NumeZiarist = rs.getString("NumeZiarist");
	        String PrenumeZiarist = rs.getString("PrenumeZiarist");
	        System.out.format("%s, %s, %s\n", idZiarist, NumeZiarist, PrenumeZiarist);
	      }
		   st.close();
	    
		}
		catch(Exception e) {
			System.out.println("nu");
		}
	}
	

}
