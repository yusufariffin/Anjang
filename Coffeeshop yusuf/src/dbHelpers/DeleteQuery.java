/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Hilmi
 *
 */
public class DeleteQuery {
	
	private Connection connection;
	
	public DeleteQuery (String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doDelete(int coffeeID) {
		// set up String to hold our query
		String query = "delete from coffee where coffeeID=?";
		
		// create preparedstatements using query string
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			// fill in preparedstatement
			ps.setInt(1, coffeeID);
			
			// execute query
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// execute the query
	}

}
