package human;

import stockpile.Stock;

/**
 * Create a Teacher who can borrow some stuff of the stock or reserve.
 * 
 * @author user
 * 
 */

public class Teacher extends Borrower {

	/**
	 * Create a teacher with a specific term borrowing.
	 * 
	 * @param termBorrowing
	 */
	public Teacher(int termBorrowing, String id, Stock stock) {
		super(id, termBorrowing, 0, stock);
		this.setTeacher(true);
	}

	/**
	 * Create a default teacher calling the constructor of user, changing the
	 * boolean isTeacher to true
	 */
	public Teacher() {
		this(0, null,null);
	}

}
