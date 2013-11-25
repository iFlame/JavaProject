package human;

/**
 * This class create all the user, they can be stock administator or a teacher
 * or a student.
 * 
 * @author user
 * 
 */
public abstract class User {

	private boolean isStockAdmin;

	/**
	 * This is the constructor, a default User is not a stock Administrator.
	 */
	public User() {
		this.isStockAdmin = false;
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
}
