package human;

import stockinterface.Constant;
import stockpile.Stock;

/**
 * This class create all the user, they can be stock administator or a teacher
 * or a student. All the user have to specify the stock who they interact with.
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public abstract class User {

	private boolean isStockAdmin;
	private boolean isTeacher;
	private Stock stock;
	private String id;

	/**
	 * Create a default User with a specific stock.
	 * 
	 * @param structure
	 */
	public User(Stock stock, String id) {
		this.id = id;
		this.stock = stock;
		this.isStockAdmin = false;
		this.isTeacher = false;
	}

	/**
	 * Print the id of the user
	 * 
	 * @return the id of the user.
	 */
	public String print() {
		return Constant.PRINT + id;
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

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isTeacher() {
		return isTeacher;
	}

	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}

}
