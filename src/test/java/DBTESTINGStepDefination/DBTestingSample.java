package DBTESTINGStepDefination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DBTestingSample {

	public Connection conn = null;
	public String dbName = "TEST";
	// String serverip="";
	public String serverport = "1433";
	public String url = "jdbc:sqlserver://PRASAD:" + serverport + ";database=" + dbName
			+ ";encrypt=true;trustServerCertificate=true";
	public Statement stmt = null;
	public ResultSet result = null;
	public String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public String databaseUserName = "PRASADS";
	public String databasePassword = "Anu$143";
	public String pa, us;

	@Given("User connects to Database")
	public void user_connects_to_database() throws SQLException {

		// Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
		stmt = conn.createStatement();
		result = null;

	}
	
	String str = "INSERT INTO Persons(PersonID, LastName, FirstName, Address, City)VALUES('3',      'vemula', 'eshwar', 'lakeview', 'vemulawada')";

	@When("User creates and execute query")
	public void user_creates_and_execute_query() throws SQLException {

		//result = stmt.executeQuery(str);
		result = stmt.executeQuery("select * from Persons");

		// Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
		stmt = conn.createStatement();
		result = null;
		result = stmt.executeQuery("select * from Persons");

	}

	@Then("Verify result of table")
	public void verify_result_of_table() throws SQLException {
		while (result.next()) {
			us = result.getString("PersonID");
			pa = result.getString("FirstName");
			System.out.println(us + " - " + pa);
		}

		conn.close();
	}

}
