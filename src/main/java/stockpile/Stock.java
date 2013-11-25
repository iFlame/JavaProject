package stockpile;

import supply.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a stock with a list of items
 * 
 * @author user
 * 
 */
public class Stock {

	private List<Item> objectList;

	/**
	 * Create a stock with a specific list of items
	 * 
	 * @param objectList
	 */
	public Stock(List<Item> objectList) {
		this.objectList = objectList;
	}
	
	/**
	 * Create a stock with a default empty list of items.
	 */
	public Stock() {
		this(new ArrayList<Item>());
	}

	/**
	 * 
	 * @return the list of items
	 */
	public List<Item> getObjectList() {
		return objectList;
	}

	/**
	 * Set the list of items
	 * @param objectList
	 */
	public void setObjectList(List<Item> objectList) {
		this.objectList = objectList;
	}

}
