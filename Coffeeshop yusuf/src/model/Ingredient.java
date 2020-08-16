package model;

public class Ingredient {
	private String ingredientID;
	private String name;
	private Double price;
	
	
	public Ingredient() {
		this.ingredientID = "0";
		this.name = "No name";
		this.price = 0.00;
	}
	
	/**
	 * @param ingredientID
	 * @param name
	 * @param price
	 */
	public Ingredient(String ingredientID, String name, Double price) {
		this.ingredientID = ingredientID;
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the ingredientID
	 */
	public String getIngredientID() {
		return ingredientID;
	}

	/**
	 * @param ingredientID the ingredientID to set
	 */
	public void setIngredientID(String ingredientID) {
		this.ingredientID = ingredientID;
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
		return "Ingredient [ingredientID=" + ingredientID + ", name=" + name +  ", price=" + price
				+ "]";
	}
}
