package human;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import stockpile.Reservation;
import stockpile.Stock;
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
	public Borrower(String id, int termBorrowing, int borrowiNumber, Stock stock) {
		super(stock);
		this.id = id;
		this.termBorrowing = termBorrowing;
		this.isTeacher = false;
		this.borrowNumber = borrowiNumber;
	}

	/**
	 * Create a new reservation if all the condition are respected ( term
	 * borrowing and borrow number.
	 * 
	 * @throws java.null.pointer exception
	 * @param termBorrow
	 * @param borrowNum
	 * @param equipment
	 * @param beginDate
	 * @param endDate
	 * @return true if the reservation is add to the undoReservation List, ie
	 *         that the ask for the reservation has been made to the stock
	 *         adminitrator
	 */
	public boolean reservation(Equipment equipment, Calendar beginDate,
			Calendar endDate) {
		long termBorrow = TimeUnit.DAYS.convert(beginDate.getTimeInMillis()
				- endDate.getTimeInMillis(), TimeUnit.MILLISECONDS);
		if (termBorrow <= termBorrowing) {
			Reservation reserv = new Reservation(id, equipment, beginDate,
					endDate);
			getStock().getUndoReservation().add(reserv);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param equipment
	 * @param endDate
	 * @return true if the borrow have been succeed and false if not
	 */
	public void borrow(Equipment equipment, Calendar endDate) {
		Calendar actualDate = Calendar.getInstance();
		reservation(equipment, actualDate, endDate);
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
