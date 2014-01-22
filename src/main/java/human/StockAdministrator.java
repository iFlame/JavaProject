package human;

import stockpile.Item;
import stockpile.Repair;
import stockpile.Reservation;
import stockpile.Stock;
import supply.Equipment;

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
			if(increaseRepair(reserv.getEquipment())) {
				reserv.setValidate(true);
				return true;
			}
		}
		return false;
	}

	/**
	 * This method check the repair time of the equipment. If the equipment have
	 * a good repair time then the method return true
	 * 
	 * @param equip
	 * @return true if the equipment can be borrow and false if the equipment
	 *         have to be repair.
	 */
	private boolean increaseRepair(Equipment equip) {
		if (equip.getRepairTime() < equip.getMaxRepair()) {
			equip.setRepairTime(equip.getRepairTime() + 1);
			return true;
		} else {
			Repair repair = new Repair(equip);
			getStock().getRepairList().add(repair);
			return false;
		}
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

	/*
	 * Partie statistique :
	 */

	/**
	 * Methode pour savoir qui est le plus gros emprunteur pour un equipement
	 * precis prend en parametre un item ou un equipement
	 */

	/**
	 * Methode pour savoir qu'elle materiel est le plus emprunter
	 */

}
