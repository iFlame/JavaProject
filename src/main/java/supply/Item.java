package supply;

import java.util.Date;

/**
 * This class create an object. An object is an equipment with two date. The
 * first date is the beginning of the borrow and the second date is the end of
 * the borrow.
 * 
 * @author user
 * 
 */
public class Item {

	private Equipment equipment;
	private Date beginDate;
	private Date endDate;

	/**
	 * Create an Object
	 * 
	 * @param equip
	 * @param date1
	 * @param date2
	 */

	public Item(Equipment equip, Date date1, Date date2) {
		this.equipment=equip;
		this.beginDate = date1;
		this.endDate = date2;
	}

	/**
	 * Create a default object with all the variable at null
	 */
	public Item() {
		this(null, null, null);
	}

	/**
	 * 
	 * @return the value of the equipment
	 */
	public Equipment getEquipment() {
		return equipment;
	}

	/**
	 * Set the value of the equipment
	 * 
	 * @param equipment
	 */
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	/**
	 * 
	 * @return value of beginDate
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * Set the value of beginDate
	 * 
	 * @param beginDate
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * 
	 * @return the value of endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the value of endDate
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
