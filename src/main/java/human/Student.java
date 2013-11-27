package human;

import stockpile.Stock;

/**
 * This class create a Student who can borrow some stuff in the Stock but for
 * less time than a teacher.
 * 
 * @author user
 * 
 */
public class Student extends Borrower {

	private static final int STUDENT_TERM_BORROWING = 7;
	private static final int BORROW_NUMBER_MAX = 1;

	/**
	 * Create a student with a specific id, who can do only one borrow and for a
	 * maximal duration of 1 week.
	 * 
	 * @param termBorrow
	 */
	public Student(String id, Stock stock) {
		super(id, STUDENT_TERM_BORROWING, BORROW_NUMBER_MAX, stock);
	}

	/**
	 * Create a default student.
	 */
	public Student() {
		this(null, null);
	}

	public static int getStudenttermborrowing() {
		return STUDENT_TERM_BORROWING;
	}

	public static int getBorrownumberMax() {
		return BORROW_NUMBER_MAX;
	}
}
