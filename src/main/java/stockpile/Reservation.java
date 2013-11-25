package stockpile;

import java.util.Date;

/**
 * This class create a reservation. She contains the date of the start of the
 * reservation and a date of then end of the reservation and the ID of the
 * reservator.
 * 
 * @author user
 * 
 */
public class Reservation {

	private Date beginDate;
	private Date endDate;
	private String reservatorID;

	/**
	 * Create a reservation with specific date and ID
	 * 
	 * @param id
	 * @param date1
	 * @param date2
	 */
	public Reservation(String id, Date date1, Date date2) {
		this.reservatorID = id;
		this.beginDate = date1;
		this.endDate = date2;
	}

	/**
	 * Create a default reservation with all at null
	 */
	public Reservation() {
		this(null, null, null);
	}

	/**
	 * 
	 * @return the date of the beginning of the reservation
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * Set the date of the beginning of the reservation
	 * 
	 * @param beginDate
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * 
	 * @return the date of the end of reservation
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the date of the end of the reservation
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
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

}
