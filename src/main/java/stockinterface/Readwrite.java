package stockinterface;


import java.io.*;
import java.util.*;

import stockpile.Item;
import stockpile.Stock;


public class Readwrite {

	private Stock stock;

	public Readwrite(Stock stock) {
		this.stock = stock;
	}
	
	
	/**
	 * Permet de créer un fichier.txt qui stocke le materiel en Stock pour que le programme la garde en mémoire à chaque 		  exécution
	 * @param path on indique le chemin relatif où l'on veut créer le fichier.txt
	 * @param listmatos liste du materiel en stock
	 */
	public void ecrireMatos(String path, ArrayList<Item> listmatos) {
		//TODO :
	}
	
	
}