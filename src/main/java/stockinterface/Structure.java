package stockinterface;

import human.User;

import java.util.List;

import stockinterface.Constant;
import stockpile.Stock;

/**
 * This class create a Structure with a list of user and a stock All the user
 * can interact with the stock
 * 
 * @author Guillaume borg, Quentin Cornevin.
 * 
 */
public class Structure {

	private Stock stock;
	private List<User> userList;

	/**
	 * Create a Structure with a specifique stock and list of user
	 * 
	 * @param stock
	 * @param list
	 */
	public Structure(Stock stock, List<User> list) {
		this.stock = stock;
		this.userList = list;
	}

	/**
	 * Print all the list of the user
	 * 
	 * @return a string with all the user id
	 */
	public String printUserList() {
		String list = Constant.LIST + Constant.NEWLINE;
		for (User user : userList) {
			list = list + user.print() + Constant.NEWLINE;
		}
		return list;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
