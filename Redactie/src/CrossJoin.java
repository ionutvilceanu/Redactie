

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;



	public class CrossJoin {

		public static void main(String [] args0) {
			try {
			Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
			
		
		
		
		
		
		Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery( "SELECT NumeZiarist, PrenumeZiarist, TipRedactie FROM Ziarist CROSS JOIN Redactie " );
	    while ( rs.next() ) {
	    	System.out.println("NumeZiarist: "+rs.getString("NumeZiarist"));
	    	System.out.println("PrenumeZiarist: "+rs.getString("PrenumeZiarist"));
	    	System.out.println("TipRedactie: "+rs.getString("TipRedactie"));
	       


	      
	       
	    }
	    rs.close();
	    stmt.close();
	    conn.close();
	 } catch ( Exception e1 ) {
	    System.err.println( e1.getClass().getName()+": "+ e1.getMessage() );
	    System.exit(0);
	 }
	}
	}



