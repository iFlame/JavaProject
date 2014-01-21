package stockpile;

import java.util.Calendar;

import supply.Equipment;

public class Repair {

	private Equipment equipement;
	private Calendar beginDate;
	private Calendar endDate;

	/**
	 * Create a repair with specific date of end and beginning and an equipment
	 * 
	 * @param equipment
	 * @param beginDate
	 * @param endDate
	 */
	public Repair(Equipment equipment, Calendar beginDate, Calendar endDate) {
		this.equipement = equipment;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	/**
	 * There is all the getters and setters
	 * 
	 */

	public Equipment getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipment equipement) {
		this.equipement = equipement;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public Calendar getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Calendar beginDate) {
		this.beginDate = beginDate;
	}

}
