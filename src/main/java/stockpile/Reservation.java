package stockpile;

import java.util.Calendar;

import supply.Equipment;

/**
 * This class create a reservation. She contains the date of the start of the
 * reservation and a date of then end of the reservation and the ID of the
 * reservator.
 * 
 * @author user
 * 
 */
public class Reservation {
	
	private Equipment equipment;
	private boolean validate;
	private Calendar beginDate;
	private Calendar endDate;
	private String reservatorID;

	/**
	 * Create a reservation with specific date and ID
	 * 
	 * @param id
	 * @param date1
	 * @param date2
	 */
	public Reservation(String id,Equipment equipment , Calendar date1, Calendar date2) {
		this.reservatorID = id;
		this.beginDate = date1;
		this.endDate = date2;
		this.validate = false;
		this.equipment=equipment;
	}

	/**
	 * Create a default reservation with all at null
	 */
	public Reservation() {
		this(null, null,null, null);
	}

	/**
	 * 
	 * @return the date of the beginning of the reservation
	 */
	public Calendar getBeginDate() {
		return beginDate;
	}

	/**
	 * Set the date of the beginning of the reservation
	 * 
	 * @param beginDate
	 */
	public void setBeginDate(Calendar beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * 
	 * @return the date of the end of reservation
	 */
	public Calendar getEndDate() {
		return endDate;
	}

	/**
	 * Set the date of the end of the reservation
	 * 
	 * @param endDate
	 */
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	/**
	 * 
	 * @return the id of the reservator
	 */
	public String getReservatorID() {
		return reservatorID;
	}

	/***
	 * Set the ID of the reservator
	 * 
	 * @param reservatorID
	 */
	public void setReservatorID(String reservatorID) {
		this.reservatorID = reservatorID;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

}
