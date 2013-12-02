package stockinterface;

/**
 * This is the main class. You have to run this class if want to start the application.
 * @author user
 *
 */
public final class Main {

	/**
	 * Throw assertoinError of the main
	 */
	private Main() {
		throw new AssertionError();
	}

	/**
	 * Start the main
	 * @param args
	 */
	public static void main(String[] args) {
		new StockDemo().showMenu();
	}

}
