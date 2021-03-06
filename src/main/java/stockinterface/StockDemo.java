package stockinterface;

import java.util.ArrayList;
import java.util.List;

import stockpile.*;
import supply.*;
import human.*;

/**
 * This class create a demo to show how the menu work
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public class StockDemo {

	private Pattern menu;
	private static final int EQUIP_NUMBER = 3;

	/**
	 * Create a speicif demo
	 */
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
			Phone equip = new Phone(OS.ANDROID);
			Tablets equip2 = new Tablets(OS.IOS);
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
		// TODO : changer le 0 et le null par les bon paramètre
		Stock stock = new Stock(itemList, noValidateReservation, null, 0);

		/**
		 * Creation of the new list of user to complete the structure
		 */
		List<User> userList = new ArrayList<>();
		User user1 = new Teacher(0, "Sander", stock);
		User user2 = new Student("quentin", stock);
		User user3 = new StockAdministrator(stock, "ali");
		userList.add(user2);
		userList.add(user1);
		userList.add(user3);

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
