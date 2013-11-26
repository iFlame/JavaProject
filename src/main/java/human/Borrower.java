package human;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import stockpile.Reservation;
import supply.Equipment;

/**
 * This class is an abstract class which create a user who can borrow some stuff
 * from the stock. A borrower has an id, a term borrowing and boolean to know if
 * he is a teacher or not
 * 
 * @author user
 * 
 */

public abstract class Borrower extends User {

	private boolean isTeacher;
	private int termBorrowing;
	private String id;
	private int borrowNumber;

	/**
	 * Create a borrower with a specific id and a term borrowing
	 * 
	 * @param id
	 * @param termBorrowing
	 */
	public Borrower(String id, int termBorrowing, int borrowNumber,
			Structure struct) {
		super(struct);
		this.id = id;
		this.termBorrowing = termBorrowing;
		this.isTeacher = false;
		this.borrowNumber = borrowNumber;
	}

	/**
	 * Create a Borrower, calling the super constructor of the class User.
	 * Default user are not teachers.
	 */
	public Borrower() {
		this(null, 0, 0, null);
	}

	/**
	 * Create a new reservation if all the condition are respected ( term
	 * borrowing and borrow number )
	 * 
	 * @param termBorrow
	 * @param borrowNum
	 * @param equipment
	 * @param beginDate
	 * @param endDate
	 * @return true if the reservation succeed
	 */
	public boolean reservation(Equipment equipment, Calendar beginDate,
			Calendar endDate) {
		// TODO : Demander a kevin !!!!!!!!!
		changeDate(beginDate);
		changeDate(endDate);
		if (getReservationTime(beginDate, endDate) <= termBorrowing) {
			Reservation reserv = new Reservation(id, beginDate, endDate);
			this.getUserStructure().getStock().getUndoReservation().add(reserv);
			// TODO : Probleme pour savoir si la reservation a été validé ou
			// non.
		} else {
			return false;
		}
		// TODO : devra etre supprimé une fois le 2eme TODO terminié
		return false;
	}

	/**
	 * 
	 * @param equipment
	 * @param endDate
	 * @return true if the borrow have been succeed and false if not
	 */
	public boolean borrow(Equipment equipment, Calendar endDate) {
		Calendar actualDate = Calendar.getInstance();
		return reservation(equipment, actualDate, endDate);
	}

	/**
	 * Check if the date if lenient or not, if the date is not good change it.
	 * 
	 * @param date
	 * @return
	 */
	private Calendar changeDate(Calendar date) {
		if (!date.isLenient()) {
			date.setLenient(true);
			return date;
		}
		return date;
	}

	/**
	 * 
	 * @param beginDate
	 * @param endDate
	 * @return the value of the time between the two dates
	 */
	private long getReservationTime(Calendar beginDate, Calendar endDate) {
		long termBorrow = TimeUnit.DAYS.convert(beginDate.getTimeInMillis()
				- endDate.getTimeInMillis(), TimeUnit.MILLISECONDS);
		return termBorrow;
	}

	/**
	 * 
	 * @return the value of the boolean isTeacher
	 */
	public boolean isTeacher() {
		return isTeacher;
	}

	/**
	 * Set the value of the boolean isTeacher
	 * 
	 * @param isTeacher
	 */
	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}

	/**
	 * 
	 * @return the term of borrowing
	 */
	public int getTermBorrowing() {
		return termBorrowing;
	}

	public void setTermBorrowing(int termBorrowing) {
		this.termBorrowing = termBorrowing;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBorrowNumber() {
		return borrowNumber;
	}

	public void setBorrowNumber(int borrowNumber) {
		this.borrowNumber = borrowNumber;
	}

}
