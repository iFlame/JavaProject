package stockpile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import stockpile.Reservation;
import supply.Equipment;

/**
 * This class create an Item, which is composed of an equipment and a list of
 * reservation
 * 
 * @author user
 * 
 */
public class Item {

	private Equipment equipment;
	private List<Reservation> reservationList; 

	/**
	 * Create an Object
	 * 
	 * @param equip
	 * @param date1
	 * @param date2
	 */

	public Item(Equipment equip, List<Reservation> reservationList) {
		this.equipment = equip;
		this.reservationList = reservationList;
	}

	/**
	 * Create a default object with all the variable at null
	 */
	public Item() {
		this(null, null);
	}

		
	/**
	 * Methode qui parcourt la liste de reservation et renvoie l'id du plus grand emprunteur de cet item :
	 * @param rien
	 */
	

	public String bestBorrower(){
		ArrayList<String> borrower  = new ArrayList<String>();
		ArrayList<Integer> count=new ArrayList<Integer>();
		for (Reservation reserv: reservationList){
			if (!borrower.contains(reserv.getReservatorID())){
				borrower.add(reserv.getReservatorID());
				count.add(1);
			}
			else{
				count.add(borrower.indexOf(reserv.getReservatorID()), 
						count.get(borrower.indexOf(reserv.getReservatorID())+1));
			}	
			return borrower.get(count.indexOf(Collections.max(count)));
		}
		return null;
		
		
	}
	
	
	
	
	/**
	 * Methode qui parcours la liste de reservation edt regarde combien de fois le plus emprunteur a emprunté :
	 * @param rien
	 */
	
	public int numberBorrowing(){
		ArrayList<String> borrower  = new ArrayList<String>();
		ArrayList<Integer> count=new ArrayList<Integer>();
		for (Reservation reserv: reservationList){
			if (!borrower.contains(reserv.getReservatorID())){
				borrower.add(reserv.getReservatorID());
				count.add(1);
			}
			else{
				count.add(borrower.indexOf(reserv.getReservatorID()), 
						count.get(borrower.indexOf(reserv.getReservatorID())+1));
			}	
			return count.indexOf(Collections.max(count));
		}
		return 0;
		
		
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
	 * @return the list of reservation
	 */
	public List<Reservation> getReservationList() {
		return reservationList;
	}

	/***
	 * Set the list of reservation
	 * 
	 * @param reservationList
	 */
	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}
}
