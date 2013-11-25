package human;

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
	public Teacher(int termBorrowing) {
		super();
		this.setTeacher(true);
		this.setTermBorrowing(termBorrowing);
	}

	/**
	 * Create a default teacher calling the constructor of user, changing the
	 * boolean isTeacher to true
	 */
	public Teacher() {
		this(0);
	}

}
