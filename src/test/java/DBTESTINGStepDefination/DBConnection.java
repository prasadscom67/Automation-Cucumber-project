package DBTESTINGStepDefination;


import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DBConnection {
	public static void main(String args[]) throws ClassNotFoundException, SQLException { 	
    	
    	
    	Connection conn = null;
        String dbName = "TEST";
        //String serverip="";
        String serverport="1433";
        String url= "jdbc:sqlserver://PRASAD:"+serverport+";database="+dbName+";encrypt=true;trustServerCertificate=true";
        Statement stmt = null;
        ResultSet result = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String databaseUserName = "PRASADS";
        String databasePassword = "Anu$143";
        
        try {
            //Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = conn.createStatement();
            result = null;
            String pa,us,EmpID,FirstName,LastName,Email,AddressLine,City;
            String query = "select * from Emp INNER JOIN Persons ON Emp.City=Persons.City";
            //String query = "select * from Persons";
            result = stmt.executeQuery(query);
            
            while (result.next()) {
                //us=result.getString("PersonID");
                //pa = result.getString("FirstName");
                EmpID = result.getString("EmpID"); 
                FirstName = result.getString("FirstName");
                LastName = result.getString("LastName");
                Email = result.getString("Email");
                AddressLine = result.getString("AddressLine");
                City = result.getString("City");
                System.out.println(EmpID+"-"+FirstName+"-"+LastName+"-"+Email+"-"+AddressLine+"-"+City);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("DB close ");
        }
	}
}
