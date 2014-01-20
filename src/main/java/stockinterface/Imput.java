package stockinterface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This Class handle all the imput of the user
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */

public class Imput {

	private Scanner reader;

	/**
	 * Create an basic imput.
	 */
	public Imput() {
		reader = new Scanner(System.in);
	}

	/**
	 * Check if the user give an int or not
	 * 
	 * @return 999 if the user dont give an int and return the value of the user
	 *         if it's an int
	 */
	public int getInt() {
		try {
			return reader.nextInt();
		} catch (InputMismatchException e) {
			reader = new Scanner(System.in);
			return Constant.WRONG_ANSWER;
		}
	}

	/**
	 * Check if the user give a String
	 * 
	 * @return a checked String
	 */
	public String getString() {
		try {
			return reader.next();
		} catch (InputMismatchException e) {
			reader = new Scanner(System.in);
			return Constant.WRONG_IMPUT;
		}
	}

	/**
	 * @return A line of text from the user.
	 */
	public String readLine() {
		return reader.nextLine();
	}

}
