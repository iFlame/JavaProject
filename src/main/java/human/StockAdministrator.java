package human;

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
	public StockAdministrator(Stock stock) {
		super(stock);
		this.setStockAdmin(true);
	}

	/**
	 * Create a default StockAdministrator with a null at stock
	 */
	public StockAdministrator() {
		this(null);
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

}
