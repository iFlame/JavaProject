package stockinterface;

public final class Constant {

	private Constant () {
		throw new AssertionError();
	}
	/**
	 * Make new line 
	 */
	public static final String NEWLINE = System.getProperty("line.separator");
	
	/**
	 * Constante of the class StockDemoInterface
	 */
	public static final int BUFFER_SIZE = 2048;
	public static final String WELCOME = "Welcome to the menu.";
	public static final String CLOSE = " The program has been closed.";

	public static final String MENU1 = "A demo have already been created, you can use it or create an other one.";
	public static final String CHOICE1 = "1. Use the default demo.";
	public static final String CHOICE2 = "2. Create a new demo.";
	
	public static final String MENU2 = "Welcome to default demo.";
	public static final String CHOICE21 = "1. Log as a teacher";
	public static final String CHOICE22 = "2. Log as a Student";
	public static final String CHOICE23 = "3. Print the list of user in the demo.";
		
	public static final String MENU3 = "Welcome to the Teacher menu. ";
	public static final String QUESTION31 = "What do you want to book ?";
	public static final String ANSWER31 = "1. Tablet(s)";
	public static final String ANSWER32 = "2. Phone(s)";
	public static final String ANSWER33 = "3. Headset(s)";
	public static final String ANSWER34 = "4. Camera(s)";
	public static final String QUESTION32 = "How many of them do you want ?";
	/**
	 * Constante de la classe Imput
	 */
	public static final int WRONG_ANSWER = 999;
	
	/**
	 * Constante de la classe User
	 */
	public static final String PRINT="The user id is : ";
	
	/**
	 * Constante de la classe Structure
	 */
	public static final String LIST = "This is the list of user of the demo : ";
}
