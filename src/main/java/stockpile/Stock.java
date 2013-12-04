package stockpile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import supply.Equipment;

/**
 * Create a stock with a list of items
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public class Stock {

	private List<Item> objectList;
	private List<Reservation> undoReservation;

	/**
	 * Create a stock with a specific list of items
	 * 
	 * @param objectList
	 */
	public Stock(List<Item> objectList, List<Reservation> undoReservation) {
		this.objectList = objectList;
		this.undoReservation = undoReservation;
	}

	/**
	 * Create a stock with a default empty list of items.
	 */
	public Stock() {
		this(new ArrayList<Item>(), new ArrayList<Reservation>());
	}

	/**
	 * 
	 * @param reserv
	 * @return true if the equipment of the list is available between the two
	 *         dates give by the user
	 */
	public boolean isAvailable(Reservation reserv) {
		for (Item item : objectList) {
			if ((reserv != null) && (item.getEquipment() != null)
					&& (item.getEquipment().equals(reserv.getEquipment()))
					&& (timeAvailable(item, reserv.getBeginDate()))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param item
	 * @param beginDate
	 * @param endDate
	 * @return if an item is available during the time given by the user
	 */
	private boolean timeAvailable(Item item, Calendar beginDate) {
		if ((item != null) && (beginDate != null)) {
			for (Reservation reserv : item.getReservationList()) {
				if ((reserv.getEndDate() != null)
						&& (TimeUnit.DAYS.convert(
								reserv.getEndDate().getTimeInMillis()
										- beginDate.getTimeInMillis(),
								TimeUnit.MILLISECONDS)) > 0) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * This method check if there is enough equipment in the stock
	 * 
	 * @param equipment
	 * @param reservationNumber
	 * @return true if there is enough equipment in the stock
	 */
	public boolean getEquipmentNumber(Equipment equipment, int reservationNumber) {
		int reservNumber = 0;
		for (Item item : objectList) {
			if (item.getEquipment().equals(equipment)) {
				reservNumber++;
			}
		}
		if (reservNumber > reservationNumber) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @return the list of items
	 */
	public List<Item> getObjectList() {
		return objectList;
	}

	/**
	 * Set the list of items
	 * 
	 * @param objectList
	 */
	public void setObjectList(List<Item> objectList) {
		this.objectList = objectList;
	}

	public List<Reservation> getUndoReservation() {
		return undoReservation;
	}

	public void setUndoReservation(List<Reservation> undoReservation) {
		this.undoReservation = undoReservation;
	}

}
