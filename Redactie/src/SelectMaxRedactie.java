import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMaxRedactie {
	public static void main(String [] args0) {
		Statement stmt = null;
		try {
			try{
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		
		stmt = conn.createStatement();
		String query = "SELECT MAX(idRedactie) FROM Redactie";
		ResultSet rs=stmt.executeQuery(query);			
		//Extact result from ResultSet rs
		while(rs.next()){
		    System.out.println("MAX(idRedactie)="+rs.getInt("MAX(idRedactie)"));				
		  }
		// close ResultSet rs
		rs.close();
	   } catch(SQLException s){						
			s.printStackTrace();
		 }
	// close Statement

	stmt.close();
	}catch (Exception e){
		e.printStackTrace();
	 }
}
}


