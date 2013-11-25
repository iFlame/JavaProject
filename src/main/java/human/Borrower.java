package human;

import java.util.Date;

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
	public Borrower(String id, int termBorrowing, int borrowNumber) {
		super();
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
		this(null, 0, 0);
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
	public boolean reservation(int termBorrow, int borrowNum,
			Equipment equipment, Date beginDate, Date endDate) {
		if (termBorrow <= termBorrowing) {
			for (int i = 0; (i < borrowNumber) && (i < borrowNum); i++) {
				// TODO : check if the equipment is avalaible and if everything
				// is ok.
			}
		} else {
			return false;
		}

		return false;
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
