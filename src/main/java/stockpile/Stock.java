package stockpile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import stockinterface.Constant;
import supply.Equipment;
import supply.Type;

/**
 * Create a stock with a list of items
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public class Stock {

	private List<Item> objectList;
	private List<Reservation> undoReservation;
	private List<Repair> repairList;
	private int maxCapa;

	/**
	 * Create a stock with a specific list of items
	 * 
	 * @param objectList
	 */
	public Stock(List<Item> objectList, List<Reservation> undoReservation,
			List<Repair> repList, int maxCapa) {
		this.objectList = objectList;
		this.undoReservation = undoReservation;
		this.repairList = repList;
		this.maxCapa = maxCapa;
	}

	/**
	 * Create a stock with a default empty list of items.
	 */
	public Stock() {
		this(new ArrayList<Item>(), new ArrayList<Reservation>(),
				new ArrayList<Repair>(), Constant.EXIT_NUMBER);
	}

	/**
	 * 
	 * @param reserv
	 * @return true if the equipment of the list is available between the two
	 *         dates give by the user
	 */
	public boolean isAvailable(Reservation reserv) {
		for (Item item : objectList) {
			if (item.getEquipment().getType()
					.equals(reserv.getEquipment().getType())
					&& (timeAvailable(item, reserv.getBeginDate(),
							reserv.getEndDate()))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param item
	 * @param beginDate
	 * @param endDate
	 * @return if an item is available during the time given by the user
	 */
	private boolean timeAvailable(Item item, Calendar beginDate, Calendar endDat) {
		if (item.getReservationList().isEmpty()) {
			return true;
		}
		for (Reservation reserv : item.getReservationList()) {
			long time = TimeUnit.DAYS.convert(reserv.getEndDate()
					.getTimeInMillis() - beginDate.getTimeInMillis(),
					TimeUnit.MILLISECONDS);
			long time2 = TimeUnit.DAYS.convert(reserv.getBeginDate()
					.getTimeInMillis() - endDat.getTimeInMillis(),
					TimeUnit.MILLISECONDS);
			if (time > 0) {
				return true;
			} else if ((time < 0) && (time2 > 0)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method check if there is enough equipment in the stock
	 * 
	 * @param equipment
	 * @param reservationNumber
	 * @return true if there is enough equipment in the stock
	 */
	public boolean getEquipmentNumber(Equipment equipment, int reservationNumber) {
		int reservNumber = 0;
		for (Item item : objectList) {
			if (item.getEquipment().equals(equipment)) {
				reservNumber++;
			}
		}
		if (reservNumber > reservationNumber) {
			return false;
		}
		return true;
	}

	/**
	 * Parcours la liste des items et conte pour chaque item le nombre de
	 * reservation ( taille de la reservationList ) et addition pour les items
	 * ayant le meme equipement
	 */
	
	public Type itemMaxReserv(){
		ArrayList<Type> equip  = new ArrayList<>();
		ArrayList<Integer> count=new ArrayList<Integer>();
		for (Item item : objectList ){
			if (!equip.contains(item.getEquipment().getType())){
				equip.add(item.getEquipment().getType());
				count.add(1);
			}
			else{
				count.add(equip.indexOf(item.getEquipment().getType()), 
				count.get(equip.indexOf(item.getEquipment().getType())+1));
			}	
			return equip.get(count.indexOf(Collections.max(count)));
		}
		return null;

	}
	
	public String biggestBorrower(){
		ArrayList<String> id  = new ArrayList<>();
		ArrayList<Integer> count=new ArrayList<Integer>();
		for (Item item: objectList){
			for(Reservation reserv: item.getReservationList()){
				if(!id.contains(reserv.getReservatorID())){
					id.add(reserv.getReservatorID());
					count.add(1);
				}
				else{
					count.add(id.indexOf(reserv.getReservatorID()),
							count.get(id.indexOf(reserv.getReservatorID())+1));
				}
			}
		}
		return id.get(count.indexOf(Collections.max(count)));
	}
			
		
	
		
			
		
	
	
	
	
	
	
	/**
	 * Methode qui va conter pour le nombre d'emprunt si la string en parametre est l'id d'un des plus gros emprunteur
	 * @param string
	 */
	
	
	
	/**
	 * Methode qui renvoie le plus gros emprunteur
	 */
	//TODO :
	
	

	/**
	 * This method return the size of the objectList
	 * 
	 * @return the size of the list if the list is not null and return 0 if the
	 *         list is null
	 */
	public int getItemListSize() {
		if (objectList != null) {
			return objectList.size();
		}
		return Constant.EXIT_NUMBER;
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
	 * 
	 * @param objectList
	 */
	public void setObjectList(List<Item> objectList) {
		this.objectList = objectList;
	}

	public List<Reservation> getUndoReservation() {
		return undoReservation;
	}

	public void setUndoReservation(List<Reservation> undoReservation) {
		this.undoReservation = undoReservation;
	}

	public List<Repair> getRepairList() {
		return repairList;
	}

	public void setRepairList(List<Repair> repairList) {
		this.repairList = repairList;
	}

	public int getMaxCapa() {
		return maxCapa;
	}

	public void setMaxCapa(int maxCapa) {
		this.maxCapa = maxCapa;
	}

}
