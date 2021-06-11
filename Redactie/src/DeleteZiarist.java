import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteZiarist {

	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");

		
		String query = "delete from Ziarist where idZiarist = ?";
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt(1, 9);

	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }

	  }
}
