import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectZiaristRedactie {
	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
		 String query = "SELECT idZiarist FROM Ziarist, Redactie_Ziarist WHERE Redactie_idRedactie = 1  ";
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      Statement st = conn.createStatement();
		  ResultSet rs = st.executeQuery(query);
		  int idZiarist = rs.getInt("idZiarist");
		  System.out.println(idZiarist);
	      

	      // execute the java preparedstatement
	      preparedStmt.executeUpdate();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  }

}
