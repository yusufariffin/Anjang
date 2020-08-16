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
import model.Ingredient;

/**
 * @author Hilmi
 *
 */
public class ReadQuery {

	private Connection connection;
	private ResultSet results;
	private ResultSet results2;
	
	public ReadQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		//set up driver
		//makes new instance of the driver object
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); //use DriverManager to create the getConnection object
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead() {
		String query = "select * from coffee";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery(); //store in results
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable() {
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()) { //next() method will move pointer. if record exist in next position, return true
				Coffee coffee = new Coffee();
				coffee.setCoffeeID(this.results.getInt("coffeeID"));
				coffee.setName(this.results.getString("name"));
				coffee.setDescription(this.results.getString("description"));
				coffee.setPrice(this.results.getDouble("price"));
				
				table += "<tr>";
				table += "<td>";
				table += coffee.getCoffeeID();
				table += "</td>";
				table += "<td>";
				table += coffee.getName();
				table += "</td>";
				table += "<td>";
				table += coffee.getDescription();
				table += "</td>";
				table += "<td>";
				table += coffee.getPrice();
				table += "</td>";
				table += "<td>";
					table += "<a href=update?coffeeID=" + coffee.getCoffeeID() + ">update</a> <a href=delete?coffeeID=" + coffee.getCoffeeID() + ">delete</a>";
				table += "</td>";
				table += "</tr>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		
		return table;
	}
	
	public void doRead2() {
		String query2 = "select * from ingredient";
		
		try {
			PreparedStatement ps2 = this.connection.prepareStatement(query2);
			this.results2= ps2.executeQuery(); //store in results
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public String getHTMLTable2() {
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results2.next()) { //next() method will move pointer. if record exist in next position, return true			
				Ingredient ingredient = new Ingredient();
				ingredient.setIngredientID(this.results2.getString("ingredientID"));
				ingredient.setName(this.results2.getString("name"));
				ingredient.setPrice(this.results2.getDouble("price"));
				
				table += "<tr>";
				table += "<td>";
				table += ingredient.getIngredientID();
				table += "</td>";
				table += "<td>";
				table += ingredient.getName();
				table += "</td>";
				table += "<td>";
				table += ingredient.getPrice();
				table += "</td>";
				table += "<td>";
				table += "<a href=update?coffeeID=" + ingredient.getIngredientID() + ">update</a> <a href=delete?coffeeID=" + ingredient.getIngredientID() + ">delete</a>";
			table += "</td>";
				table += "</tr>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		
		return table;
	}
}
