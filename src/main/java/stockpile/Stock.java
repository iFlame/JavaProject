package stockpile;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a stock with a list of items
 * 
 * @author user
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
		//TODO :
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
