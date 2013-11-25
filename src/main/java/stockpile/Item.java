package stockpile;

import java.util.List;

import stockpile.Reservation;
import supply.Equipment;

/**
 * This class create an Item, which is composed of an equipment and a list of
 * reservation
 * 
 * @author user
 * 
 */
public class Item {

	private Equipment equipment;
	private List<Reservation> reservationList; 

	/**
	 * Create an Object
	 * 
	 * @param equip
	 * @param date1
	 * @param date2
	 */

	public Item(Equipment equip, List<Reservation> reservationList) {
		this.equipment = equip;
		this.reservationList = reservationList;
	}

	/**
	 * Create a default object with all the variable at null
	 */
	public Item() {
		this(null, null);
	}

	/**
	 * 
	 * @return the value of the equipment
	 */
	public Equipment getEquipment() {
		return equipment;
	}

	/**
	 * Set the value of the equipment
	 * 
	 * @param equipment
	 */
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	/**
	 * 
	 * @return the list of reservation
	 */
	public List<Reservation> getReservationList() {
		return reservationList;
	}

	/***
	 * Set the list of reservation
	 * 
	 * @param reservationList
	 */
	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}
}
