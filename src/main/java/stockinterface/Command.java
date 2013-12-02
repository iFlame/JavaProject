package stockinterface;

/**
 * This class is an enumeration of all the command available in the menu
 * 
 * @author user
 * 
 */
public enum Command {

	HOME("Home"), QUIT("Quit"), NOTHING("Nothing");

	/**
	 * Define the command with a String
	 * 
	 * @param command
	 */
	private String word = "";

	Command(String command) {
		this.word = command;
	}

	/**
	 * Print the command
	 */
	public String toString() {
		return word;
	}
}
