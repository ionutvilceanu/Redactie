

	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
		import java.sql.Statement;
	import java.util.Calendar;
	import java.sql.Connection;


	public class InsertRedactie {
			public static void main(String [] args0) {
				try {
				Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
				//System.out.println("ConnSucces");
				// create a sql date object so we can use it in our INSERT statement
			      Calendar calendar = Calendar.getInstance();
			      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

			      // the mysql insert statement
			      String query = " insert into Redactie (idRedactie,  TipRedactie, NR_Ziaristi_Redactie)"
			        + " values (?, ?, ?)";

			      // create the mysql insert preparedstatement
			      PreparedStatement preparedStmt = conn.prepareStatement(query);
			      preparedStmt.setInt (1, 9);
			      preparedStmt.setString (2, "Maine" );
			      preparedStmt.setInt (3, 8 );
			      
			      
			      

			      // execute the preparedstatement
			      preparedStmt.execute();
			      
			      conn.close();
			    }
			    catch (Exception e)
			    {
			      System.err.println("Got an exception!");
			      System.err.println(e.getMessage());
			    }
			  }
			
				


			}

