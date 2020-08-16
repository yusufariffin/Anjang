/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Coffee;

/**
 * @author Hilmi
 *
 */
public class AddQuery {
	
	public Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAdd(Coffee coffee) {
		String query = "insert into coffee (coffeeID, name, description, price) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, coffee.getCoffeeID());
			ps.setString(2, coffee.getName());
			ps.setString(3, coffee.getDescription());
			ps.setDouble(4, coffee.getPrice());
			
			ps.executeUpdate();  
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
