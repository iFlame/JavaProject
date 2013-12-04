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
	private Command unknownCommand;

	public Imput() {
		reader = new Scanner(System.in);
	}

	public Command getCommand() {

		Command command = null;
		boolean quit = false;
		boolean unknown = true;

		do {

			String word = reader.next();
			readLine();

			for (Command keyword : Command.values()) {
				try {
					if (keyword.toString().compareTo(word) == 0) {
						return keyword;
					}
				} catch (IllegalArgumentException e) {
					command = unknownCommand;
				}
			}
			if (unknown) {
				return Command.NOTHING;
			}

		} while (!quit);
		return command;
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
	 * @return A line of text from the user.
	 */
	public String readLine() {
		return reader.nextLine();
	}

}
