package human;

import stockpile.Reservation;

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
	public StockAdministrator(Structure struct) {
		super(struct);
		this.setStockAdmin(true);
	}

	/**
	 * Create a default StockAdministrator with a null as a structure.
	 */
	public StockAdministrator() {
		this(null);
	}

	/**
	 * 
	 * @param reserv
	 * @return true if the equipment is available in the stock
	 */
	public boolean validation(Reservation reserv) {
		if (this.getUserStructure().getStock().isAvailable(reserv)) {
			return true;
		}
		return false;
	}

}
