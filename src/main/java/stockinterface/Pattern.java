package stockinterface;

import human.Borrower;
import human.StockAdministrator;
import human.User;

import java.util.Calendar;

import stockpile.Reservation;
import supply.Camera;
import supply.Equipment;
import supply.Headset;
import supply.Phone;
import supply.Tablets;

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
		} else {
			display.wrongImput();
		}
	}

	/**
	 * Display the menu of the default demo
	 * 
	 */
	private void menu21() {

		String answer2 = null;
		boolean boucle = true;
		while (boucle) {
			display.menu21();
			answer2 = imput.getString();

			if (answer2.equals("3")) {
				menu33();
			} else if (answer2.equals("0")) {
				boucle = false;
			}

			for (User user : structure.getUserList()) {
				if (answer2.equals(user.getId()) && (user.isStockAdmin())) {
					stockAdmin();
				} else if (answer2.equals(user.getId())) {
					menu31(user.getId());
				}
			}

		}
	}

	private void stockAdmin() {
		boolean boucle = true;
		int answer = Constant.EXIT_NUMBER;
		while (boucle) {
			display.menuStockAdmin();
			answer = imput.getInt();
			if (answer == Constant.CHOICE_ONE) {
				for (User user : structure.getUserList()) {
					if (user.getClass().equals(StockAdministrator.class)) {
						StockAdministrator stockAd = (StockAdministrator) user;
						for (Reservation reserv : structure.getStock()
								.getUndoReservation()) {
							stockAd.validation(reserv);
						}
						boucle = false;
					}
				}
			}
		}
	}

	/**
	 * This is the menu if the user want to change the parameter of the demo
	 */
	private void menu22() {
		// TODO : Si jamais tu recréer tout sans passer par la démo.
	}

	/**
	 * {@link} stockinterface.Display.menu31 Handle the interface if the user
	 * decide to log as a teacher.
	 */
	private void menu31(String userID) {
		int answer1 = Constant.EXIT_NUMBER;
		int numberEquip;

		boolean boucle = true;
		boolean boucle2 = true;
		boolean boucle3 = true;
		boolean boucle4 = true;
		boolean boucle5 = true;

		Calendar beginDate;
		Calendar endDate;

		Equipment equip = null;

		while (boucle) {
			display.menu31();
			answer1 = imput.getInt();
			if (answer1 == Constant.EXIT_NUMBER) {
				boucle2 = false;
			}
			if ((Constant.EXIT_NUMBER <= answer1)
					&& (answer1 <= Constant.CHOICE_FAUR)) {
				equip = choiceEquip(answer1);
				boucle = false;
			} else {
				display.wrongImput();
			}
		}
		numberEquip = equipNumber(boucle2);
		beginDate = beginDate(boucle3);
		endDate = endDate(boucle4);

		int reservDone = numberEquip;
		Reservation reserv = new Reservation(userID, equip, beginDate, endDate);

		while (boucle5) {

			if (structure.getStock().isAvailable(reserv)) {
				for (User user : structure.getUserList()) {
					boucle5 = menu5(user,userID,equip,beginDate,endDate,boucle5);
				}
				numberEquip--;
				if (numberEquip == Constant.EXIT_NUMBER) {
					boucle5 = false;
				}
			} else {
				boucle5 = false;
			}
		}
		reservDone = reservDone - numberEquip;
		reservationSucces(reservDone);

	}
	
	private boolean menu5(User user, String userID, Equipment equip, Calendar beginDate, Calendar endDate, boolean boucle5) {
		boolean boucle = boucle5;
		if (Borrower.class.isAssignableFrom(user.getClass())
				&& (user.getId().equals(userID))) {
			Borrower b = (Borrower) user;
			boucle = b.reservation(equip, beginDate, endDate);
			return boucle;
		}
		return boucle;
	}
	
	private void reservationSucces(int reservDone) {
		display.reservDone(reservDone);
	}

	/**
	 * Ask the user what equipment he want.
	 * 
	 * @param answer
	 * @return
	 */
	private Equipment choiceEquip(int answer) {
		Equipment equip = null;
		switch (answer) {
		case Constant.CHOICE_ONE:
			equip = new Tablets();
			return equip;
		case Constant.CHOICE_TWO:
			equip = new Phone();
			return equip;
		case Constant.CHOICE_THREE:
			equip = new Headset();
			return equip;
		case Constant.CHOICE_FAUR:
			equip = new Camera();
			return equip;
		}
		return equip;
	}

	/**
	 * This is the part who ask the number of stuff the user need
	 * 
	 * @param boucle2
	 */
	private int equipNumber(boolean boucle2) {
		boolean boucle = boucle2;
		int answer2 = Constant.EXIT_NUMBER;
		while (boucle) {
			display.question32();
			answer2 = imput.getInt();
			if (answer2 >= Constant.EXIT_NUMBER) {
				boucle = false;
				return answer2;
			}
		}
		return Constant.EXIT_NUMBER;
	}

	/**
	 * Direct the menu for the begin date of the reservation
	 * 
	 * @param boucle
	 */
	private Calendar beginDate(boolean boucle3) {
		int answer1 = Constant.EXIT_NUMBER;
		int answer2 = Constant.EXIT_NUMBER;
		boolean boucle = boucle3;
		Calendar cal = Calendar.getInstance();

		while (boucle) {
			display.beginDateDay();
			answer1 = imput.getInt();
			display.beingDateMonth();
			answer2 = imput.getInt();
			if (checkDate(answer1, answer2)) {
				boucle = false;
				cal.set(Calendar.DAY_OF_MONTH, answer1);
				cal.set(Calendar.MONTH, answer2);
				return cal;
			}
			display.incorrectDate();
		}
		return cal;
	}

	/**
	 * Check if the date is correct.
	 * 
	 * @param dayNumber
	 * @param monthNumber
	 * @return
	 */
	private boolean checkDate(int dayNumber, int monthNumber) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, monthNumber - 1);

		if ((monthNumber < Constant.EXIT_NUMBER)
				|| (monthNumber >= Constant.MAX_MONTH)
				|| (dayNumber > cal.getActualMaximum(Calendar.DAY_OF_MONTH))) {
			return false;
		}
		return true;
	}

	/**
	 * Ask the user the end of his reservation until he give a good date
	 * 
	 * @param boucle4
	 * @return the checked End date of the reservation
	 */
	private Calendar endDate(boolean boucle4) {
		int answer1 = Constant.EXIT_NUMBER;
		int answer2 = Constant.EXIT_NUMBER;

		boolean boucle = boucle4;

		Calendar cal = Calendar.getInstance();

		while (boucle) {
			display.endDateDay();
			answer1 = imput.getInt();
			display.endDateMonth();
			answer2 = imput.getInt();
			if (checkDate(answer1, answer2)) {
				cal.set(Calendar.DAY_OF_MONTH, answer1);
				cal.set(Calendar.MONTH, answer2);

				return cal;
			}
			display.incorrectDate();
		}
		return cal;
	}

	/**
	 * This method ask the display to print the userList;
	 */
	private void menu33() {
		String userList = structure.printUserList();
		display.printUserList(userList);
	}
}
