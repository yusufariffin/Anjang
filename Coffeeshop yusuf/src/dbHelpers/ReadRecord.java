/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Coffee;

/**
 * @author Hilmi
 *
 */
public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Coffee coffee = new Coffee();
	private int coffeeID;
	
	public ReadRecord (String dbName, String uname, String pwd, int coffeeID) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.coffeeID = coffeeID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead() {
		String query = "select * from coffee where coffeeID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.coffeeID);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			coffee.setCoffeeID(this.results.getInt(1));
			coffee.setName(this.results.getString("name"));
			coffee.setDescription(this.results.getString("description"));
			coffee.setPrice(this.results.getDouble("price"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Coffee getCoffee() {
		return this.coffee;
	}

}
