package human;

import human.Structure;

/**
 * This class create all the user, they can be stock administator or a teacher
 * or a student.
 * 
 * @author user
 * 
 */
public abstract class User {

	private boolean isStockAdmin;
	private Structure userStructure;

	/**
	 * Create an user with a specific structure.
	 * 
	 * @param structure
	 */
	public User(Structure structure) {
		this.userStructure = structure;
		this.isStockAdmin = false;
	}

	/**
	 * This is the constructor, a default User is not a stock Administrator.
	 */
	public User() {
		this(null);
	}

	/**
	 * 
	 * @return the value of the boolean StockAdmin
	 */
	public boolean isStockAdmin() {
		return isStockAdmin;
	}

	/**
	 * Set the value of the boolean
	 * 
	 * @param isStockAdmin
	 */
	public void setStockAdmin(boolean isStockAdmin) {
		this.isStockAdmin = isStockAdmin;
	}

	public Structure getUserStructure() {
		return userStructure;
	}

	public void setUserStructure(Structure userStructure) {
		this.userStructure = userStructure;
	}
}
