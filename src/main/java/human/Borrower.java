package human;

/**
 * This class is an abstract class which create a user who can borrow some stuff
 * from the stock
 * 
 * @author user
 * 
 */

public abstract class Borrower extends User {

	private boolean isTeacher;
	private int termBorrowing;

	/**
	 * Create a Borrower, calling the super constructor of the class User.
	 * Default user are not teachers.
	 */
	public Borrower() {
		super();
		this.isTeacher = false;
		this.termBorrowing = 0;
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

	public int getTermBorrowing() {
		return termBorrowing;
	}

	public void setTermBorrowing(int termBorrowing) {
		this.termBorrowing = termBorrowing;
	}

}
