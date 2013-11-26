package stockpile;

import java.util.ArrayList;
import java.util.List;
/**
* Create a stock with a list of items
*
* @author user
*
*/
public class Stock {

<<<<<<< HEAD
	private List<Item> objectList;
	private List<Reservation> undoReservation;

	/**
	 * Create a stock with a specific list of items
	 * 
	 * @param objectList
	 */
	public Stock(List<Item> objectList, List<Reservation> undoReservation) {
		this.objectList = objectList;
		this.undoReservation = undoReservation;
	}

	/**
	 * Create a stock with a default empty list of items.
	 */
	public Stock() {
		this(new ArrayList<Item>(), new ArrayList<Reservation>());
	}

	/**
	 * 
	 * @param reserv
	 * @return true if the equipment of the list is available between the two
	 *         dates give by the user
	 */
	public boolean isAvailable(Reservation reserv) {
		//TODO :
		return true;
	}
=======
        private Hashtable<Equipment, Integer> equipmentHashTable;

        /**
         * Initialize a stock
         *
         * @param void
         */
        public Stock() {
                this.equipmentHashTable = new Hashtable<Equipment, Integer>();
 
        }
        
        /**
         * Return the number of this equipment in stock
         * 
         * @param equipment
         * @return int return the number of avialable equipment : -1 if this equipment no exist
         */
        public int valueFromEquipmentInStock(Equipment equipment)
        {
        	if(isInStock(equipment))
        	 return equipmentHashTable.get(equipment);
        
        	System.out.println("Ce matériel n'est pas répertorié");
        	return -1; 		
        }
>>>>>>> 2b217789d298e7d2323cd1be609b7c5f55498ad4

        /**
         * Determine if an equipment exist in the stock
         * 
         * @param equipment
         * @return boolean if the equipment exist in the stock
         */
        private boolean isInStock(Equipment equipment)
        {
        	
        	return equipmentHashTable.containsKey(equipment);
        }
        

        /**
         * Add an equipment
         * 
         * @param equipment
         * @param number
         * @return void add in the HashTable the equipment with is number on value
         */
        public void addInStock(Equipment equipment, int number)
        {
        	if(!isInStock(equipment))
        	equipmentHashTable.put(equipment, number);
        	else
        		System.out.println("On ne peut ajouter un matériel déjà présent");
        }
        

<<<<<<< HEAD
	public List<Reservation> getUndoReservation() {
		return undoReservation;
	}

	public void setUndoReservation(List<Reservation> undoReservation) {
		this.undoReservation = undoReservation;
	}

=======
        /**
         * delete an equipment
         * 
         * @param equipment
         * @return void delete in the HashTable the equipment
         */
        public void deleteInStock(Equipment equipment)
        {
        	if(isInStock(equipment))
        	equipmentHashTable.remove(equipment);
        	else
        		System.out.println("On ne peut effacer le materiel non présent en stock");
        }
        
// il faudra ajouter le name en donnée membre aux equipments pour mieux comprendre
        /**
         * print the state of the stock
         * 
         * @return  void just a stock's copy
         */
        public void printStock()
        {
            Iterator<Equipment> it;
            it=equipmentHashTable.keySet().iterator(); // on cree un iterator sur les clés
             
            while(it.hasNext())
            {
               Equipment key = (Equipment) it.next();
               int value=equipmentHashTable.get(key);
               System.out.println("Matériel : " + key.getType() + " => " + value);
            }
        }
>>>>>>> 2b217789d298e7d2323cd1be609b7c5f55498ad4
}
