import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RedactieGroupBy {
	public static void main(String [] args0) {
		try {
		Connection conn	= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "parola");
		//System.out.println("ConnSucces");
		Statement st = conn.createStatement();
		 
        st = conn.createStatement();
        ResultSet rs = st
                .executeQuery("  SELECT TipRedactie, NR_Ziaristi_Redactie from Redactie ORDER BY TipRedactie DESC");
 
        while (rs.next()) {
            String TipRedactie = rs.getString(1);
            int NR_Ziaristi_Redactie = rs.getInt(2);
            System.out.println(TipRedactie);
            System.out.println(NR_Ziaristi_Redactie );
 
        }
 
        rs.close();
        st.close();
        conn.close();
 
    
 
}
		catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
}

