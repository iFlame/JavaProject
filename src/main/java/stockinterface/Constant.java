package stockinterface;

/**
 * This class contains all the constant of the project.
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public final class Constant {

	private Constant() {
		throw new AssertionError();
	}

	/**
	 * Make new line
	 */
	public static final String NEWLINE = System.getProperty("line.separator");

	/**
	 * Constante of the class StockDemoInterface
	 */
	public static final int EXIT_NUMBER = 0;
	public static final int CHOICE_ONE = 1;
	public static final int CHOICE_TWO = 2;
	public static final int CHOICE_THREE = 3;
	public static final int CHOICE_FAUR = 4;
	public static final int MAX_MONTH = 12;

	public static final int BUFFER_SIZE = 2048;
	public static final String WELCOME = "Welcome to the menu.";
	public static final String COMMAND = "Press 0 to go to the previous menu.";

	public static final String WRONG_IMPUT = "Sorry you're imput is not acceptable.";
	
	public static final String WRONG_ID = "Sorry your id has not been found.";

	public static final String MENU1 = "A demo have already been created, you can use it or create an other one.";
	public static final String CHOICE1 = "1. Use the default demo.";
	public static final String CHOICE2 = "2. Create a new demo.";

	public static final String MENU2 = "Welcome to default demo.";
	public static final String CHOICE21 = "Enter your login. (It's your id)";
	public static final String CHOICE22 = "Press 3 to print the list of the user register.";

	public static final String MENU3 = "Welcome to the borrower menu. ";
	public static final String QUESTION31 = "What do you want to book ?";
	public static final String ANSWER31 = "1. Tablet(s)";
	public static final String ANSWER32 = "2. Phone(s)";
	public static final String ANSWER33 = "3. Headset(s)";
	public static final String ANSWER34 = "4. Camera(s)";
	public static final String QUESTION32 = "How many of them do you want ?";

	public static final String BEGINDATE1 = "Insert the day of the beginning of reservation (between 1 and 31) :";
	public static final String TODAY = " Press 1 for today.";
	public static final String BEGINDATE2 = "Insert the month when your reservation begin (between 1 and 12) :";

	public static final String ENDDATE1 = "Insert the day of the end of your reservation.";
	public static final String ENDDATE2 = "Insert the month of the end of your reservation.";

	public static final String INCORRECTDATE = "Sorry your date does not exist.";

	/**
	 * Constante de la classe Imput
	 */
	public static final int WRONG_ANSWER = 999;

	/**
	 * Constante de la classe User
	 */
	public static final String PRINT = "The user id is : ";

	/**
	 * Constante de la classe Structure
	 */
	public static final String LIST = "This is the list of user of the demo : ";
}
