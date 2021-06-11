import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AverageIdZiarist {

	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
	
	Statement st = conn.createStatement();
	 
	st = conn.createStatement();
	ResultSet rs = st.executeQuery("SELECT AVG(idZiarist) FROM Ziarist");
	 
	while (rs.next()) {
	String name = rs.getString(1);
	System.out.println(name);
	 
	}
	rs.close();
	st.close();
	conn.close();
	}catch(Exception e) {
		System.out.println("nu");
	}
}
}
