package human;

import stockpile.Item;
import stockpile.Reservation;
import stockpile.Stock;

/**
 * This class create a Stock administator who handle the stock
 * 
 * @author user
 * 
 */
public class StockAdministrator extends User {

	/**
	 * Create a new StockAdministrator in a specific structure.
	 * 
	 * @param struct
	 */
	public StockAdministrator(Stock stock, String id) {
		super(stock, id);
		this.setStockAdmin(true);
	}

	/**
	 * Create a default StockAdministrator with a null at stock
	 */
	public StockAdministrator() {
		this(null, null);
	}

	/**
	 * 
	 * @throws java.null.pointer exception
	 * @param reserv
	 * @return true if the reservation has succeed that the user will have his
	 *         equipment.
	 */
	public boolean validation(Reservation reserv) {
		if (getStock().isAvailable(reserv)) {
			reserv.setValidate(true);
			return true;
		}
		return false;
	}

	/**
	 * this method check if the stock is full and if it is not the sockAdmin can
	 * add an item
	 * 
	 * @param item
	 * @return true if the item is add to the stock
	 */
	public boolean addStuff(Item item) {
		if (this.getStock().getItemListSize() < this.getStock().getMaxCapa()) {
			this.getStock().getObjectList().add(item);
			return true;
		}
		return false;
	}

}
