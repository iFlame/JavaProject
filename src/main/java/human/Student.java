package human;

/**
 * This class create a Student who can borrow some stuff in the Stock but for
 * less time than a teacher.
 * 
 * @author user
 * 
 */
public class Student extends Borrower {

	/**
	 * Create a student with a specific term borrowing.
	 * 
	 * @param termBorrow
	 */
	public Student(int termBorrow) {
		super();
		this.setTermBorrowing(termBorrow);
	}

	/**
	 * Create a default student.
	 */
	public Student() {
		this(0);
	}
}
