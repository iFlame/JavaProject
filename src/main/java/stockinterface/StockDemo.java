package stockinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import stockpile.*;
import supply.*;
import human.*;

public class StockDemo {

	private Pattern menu;
	private static final int EQUIP_NUMBER=3;
	private static final int USER_NUMBER=5;

	public StockDemo() {

		/**
		 * Item list and reservation list for the structure
		 */
		List<Item> itemList = new ArrayList<>();
		List<Reservation> noValidateReservation = new ArrayList<>();
		noValidateReservation.clear();
		/**
		 * Fill the itemList, with 2 phone and 2 talbets without reservation
		 */
		for (int i = 0; i < EQUIP_NUMBER; i++) {
			Equipment equip = new Phone(OS.ANDROID);
			Equipment equip2 = new Tablets(OS.IOS);
			List<Reservation> reservList = new ArrayList<>();
			List<Reservation> reservList2 = new ArrayList<>();
			reservList.clear();
			reservList2.clear();
			Item item = new Item(equip, reservList);
			Item item2 = new Item(equip2, reservList);
			itemList.add(item);
			itemList.add(item2);
		}

		/**
		 * Creation of the new stock
		 */
		Stock stock = new Stock(itemList, noValidateReservation);

		/**
		 * Creation of the new list of user to complete the structure
		 */
		TreeSet<User> userList = new TreeSet<>();
		for (int i = 0; i < USER_NUMBER; i++) {
			User user1 = new Teacher(0, "defaultTeacher" + i, stock);
			User user2 = new Student("defaultStudent" + i, stock);
			userList.add(user2);
			userList.add(user1);
		}

		/**
		 * Creation of the new Structure
		 */
		Structure structure = new Structure(stock, userList);

		/**
		 * Create the interface of the stockDemo with the structure
		 */
		menu = new Pattern(structure);
	}

	/**
	 * Show the interface of the stock
	 */
	public void showMenu() {
		menu.run();
	}

}
