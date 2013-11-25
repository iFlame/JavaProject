package human;

/**
 * This class create a Stock administator who handle the stock
 * 
 * @author user
 * 
 */
public class StockAdministrator extends User {

	/**
	 * Create a StockAdministrato, call the super of the class User and change
	 * the value of the boolean StockAdmin to true
	 */
	public StockAdministrator() {
		super();
		this.setStockAdmin(true);
	}

}
