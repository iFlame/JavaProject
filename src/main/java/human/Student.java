package human;

/**
 * This class create a Student who can borrow some stuff in the Stock but for
 * less time than a teacher.
 * 
 * @author user
 * 
 */
public class Student extends Borrower {
	
	private static final int STUDENTTERMBORROWING = 7;
	private static final int BORROWNUMBER = 1;
	

	/**
	 * Create a student with a specific id, who can do only one borrow and for a
	 * maximal duration of 1 week.
	 * 
	 * @param termBorrow
	 */
	public Student(String id) {
		super(id, STUDENTTERMBORROWING, BORROWNUMBER);
	}

	/**
	 * Create a default student.
	 */
	public Student() {
		this(null);
	}

	public static int getStudenttermborrowing() {
		return STUDENTTERMBORROWING;
	}

	public static int getBorrownumber() {
		return BORROWNUMBER;
	}
}
