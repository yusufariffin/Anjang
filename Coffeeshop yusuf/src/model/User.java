/**
 * 
 */
package model;

/**
 * @author mnari
 *
 */
public class User {
	
	private int userID;
	private String name;
	private String password;
	
	
	/**
	 * default constructor
	 */
	public User() {
		this.userID = 0;
		this.name = "no name";
		this.password = "password";
	}
	
	/**
	 * @param name
	 * @param password
	 */
	public User(int userID, String name, String password) {
		this.userID = userID;
		this.name = name;
		this.password = password;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override //print current state of the current object as a string
	public String toString() {
		return "User [coffeeID=" + userID + ", name =" + name + ", password =" + password + "]";
	}
	
}
