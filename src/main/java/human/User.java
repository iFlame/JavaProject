package human;

import stockpile.Stock;

/**
 * This class create all the user, they can be stock administator or a teacher
 * or a student. All the user have to specify the stock who they interact with.
 * 
 * @author user
 * 
 */
public abstract class User {

	private boolean isStockAdmin;
	private Stock stock;

	/**
	 * Create a default User with a specific stock.
	 * 
	 * @param structure
	 */
	public User(Stock stock) {
		this.stock = stock;
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

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
