package human;

import java.util.List;

import stockpile.Stock;

public class Structure {

	private Stock stock;
	private List<User> userList;

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
