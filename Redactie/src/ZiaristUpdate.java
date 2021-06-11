import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ZiaristUpdate {
	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
		 String query = "update Ziarist set idZiarist = ? where numeZiarist = ?";
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt(1, 77 );
	      preparedStmt.setString   (2, "Ion" );
	      

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
