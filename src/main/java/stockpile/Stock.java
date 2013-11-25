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
}
