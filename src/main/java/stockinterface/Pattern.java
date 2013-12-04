package stockinterface;

/**
 * This class use to navigate between the menu
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public class Pattern {

	private Structure structure;
	private Imput imput;
	private Display display;

	/**
	 * Create the interface with the user
	 * 
	 * @param struc
	 */
	public Pattern(Structure struc) {
		this.structure = struc;
		this.imput = new Imput();
		this.display = new Display();
	}

	/**
	 * Run the menu
	 */
	public void run() {
		display.welcome();
		menu1();
	}

	/**
	 * Run the first menu.
	 */
	private void menu1() {
		int answer;
		do {
			display.menu1();
			answer = imput.getInt();
			choice2(answer);
		} while (true);
	}

	/**
	 * Method who make the difference for the two choice of menu1
	 * 
	 * @param imp
	 * @return
	 */
	private void choice2(int imp) {
		if (imp == Constant.CHOICE_ONE) {
			menu21();
		} else if (imp == Constant.CHOICE_TWO) {
			menu22();
		}
		display.wrongImput();
	}

	/**
	 * Display the menu of the default demo
	 * 
	 */
	public void menu21() {
		int answer;
		boolean boucle = true;
		while (boucle) {
			display.menu21();
			answer = imput.getInt();
			choice3(answer);
			if (answer == Constant.EXIT_NUMBER) {
				boucle = false;
			}
		}
	}

	/**
	 * This is the menu if the user want to change the parameter of the demo
	 */
	public void menu22() {
		// TODO : Si jamais tu recréer tout sans passer par la démo.
	}

	/**
	 * This method guide the interface if function of the hoice of the user
	 * 
	 * @param answer
	 */
	public void choice3(int answer) {
		if (answer == Constant.CHOICE_ONE || answer == Constant.CHOICE_TWO) {
			menu31(answer);
		} else if (answer == Constant.CHOICE_THREE) {
			menu33();
		} else {
			display.wrongImput();
		}
	}

	/**
	 * {@link} stockinterface.Display.menu31 Handle the interface if the user
	 * decide to log as a teacher.
	 */
	private void menu31(int borrowerType) {
		int answer1 = Constant.EXIT_NUMBER;

		boolean boucle = true;
		boolean boucle2 = true;
		boolean boucle3 = true;
		boolean boucle4 = true;

		while (boucle) {
			display.menu31();
			answer1 = imput.getInt();
			if (answer1 == Constant.EXIT_NUMBER) {
				boucle2 = false;
			}
			if ((Constant.EXIT_NUMBER <= answer1)
					&& (answer1 <= Constant.CHOICE_FAUR)) {
				boucle = false;
			} else {
				display.wrongImput();
			}
		}
		equipNumber(boucle2);
		beginDate(boucle3);
		endDate(boucle4);

		// TODO : Si tout est ok créer la reservation.
	}

	/**
	 * This is the part who ask the number of stuff the user need
	 * 
	 * @param boucle2
	 */
	private void equipNumber(boolean boucle2) {
		int answer2 = Constant.EXIT_NUMBER;
		while (boucle2) {
			display.question32();
			answer2 = imput.getInt();
			if (answer2 >= Constant.EXIT_NUMBER) {
				boucle2 = false;
			}
		}
	}

	/**
	 * Direct the menu for the begin date of the reservation
	 * 
	 * @param boucle
	 */
	private void beginDate(boolean boucle) {
		int answer1 = Constant.EXIT_NUMBER;
		int answer2 = Constant.EXIT_NUMBER;

		while (boucle) {
			display.beginDateDay();
			answer1 = imput.getInt();
			display.beingDateMonth();
			answer2 = imput.getInt();
			if (checkDate(answer1, answer2)) {
				boucle = false;
			}
			display.incorrectDate();
		}
	}

	/**
	 * Check if the date is correct.
	 * 
	 * @param dayNumber
	 * @param monthNumber
	 * @return
	 */
	private boolean checkDate(int dayNumber, int monthNumber) {
		return false;
	}

	/**
	 * Ask the end of the date of the reservation at the user.
	 * 
	 * @param boucle
	 */
	private void endDate(boolean boucle) {
		int answer1 = Constant.EXIT_NUMBER;
		int answer2 = Constant.EXIT_NUMBER;

		while (boucle) {
			display.endDateDay();
			answer1 = imput.getInt();
			display.endDateMonth();
			answer2 = imput.getInt();
			if (checkDate(answer1, answer2)) {
				boucle = false;
			}
			display.incorrectDate();
		}
	}

	/**
	 * This method ask the display to print the userList;
	 */
	private void menu33() {
		String userList = structure.printUserList();
		display.printUserList(userList);
	}
}
