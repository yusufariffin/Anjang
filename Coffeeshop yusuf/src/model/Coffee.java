/**
 * 
 */
package model;

/**
 * @author Hilmi
 *
 */
public class Coffee {

	private int coffeeID;
	private String name;
	private String description;
	private Double price;
	
	/**
	 * default constructor
	 */
	public Coffee() {
		this.coffeeID = 1;
		this.name = "no name";
		this.description = "no description";
		this.price = 0.00;
	}
	
	/**
	 * @param coffeeID
	 * @param name
	 * @param description
	 * @param price
	 */
	public Coffee(int coffeeID, String name, String description, Double price) {
		this.coffeeID = coffeeID;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	/**
	 * @return the coffeeID
	 */
	public int getCoffeeID() {
		return coffeeID;
	}

	/**
	 * @param coffeeID the coffeeID to set
	 */
	public void setCoffeeID(int coffeeID) {
		this.coffeeID = coffeeID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override //print current state of the current object as a string
	public String toString() {
		return "Coffee [coffeeID=" + coffeeID + ", name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}
	
	
}
