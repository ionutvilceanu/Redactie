import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountZiarist {
	public static void main(String[] args) throws Exception {
	
		
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
		
		Statement st = conn.createStatement();
		 
		st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT COUNT(NumeZiarist) FROM Ziarist");
		 
		while (rs.next()) {
		String name = rs.getString(1);
		System.out.println(name);
		 
		}
		 
		rs.close();
		st.close();
		conn.close();
		 
		}
		 
		}

		
		
		
		
		
		
		
		
		

