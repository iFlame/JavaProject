package stockinterface;


import java.io.*;
import java.util.*;

import stockpile.Item;
import stockpile.Repair;
import stockpile.Reservation;
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
		try {
			FileWriter fw = new FileWriter(path);//+true qui écrase
			BufferedWriter bw = new BufferedWriter (fw);
			bw.newLine();
			PrintWriter pw = new PrintWriter(bw);
			//for si liste pas vide
			for (int i = 0; i < listmatos.size(); i++) {
				//TODO : //pw.print(listmatos.get(i).getEquipment().getType()+"\n" +listmatos.get(i).getEquipment().getId()  +"\n"+listmatos.get(i).getExemplaire()+"\n" getExemplaire c'est le nombre d'exemplaire dans la liste */ + /*listmatos.get(i).getExemplaireMax()+"\n" */);	
			}
			pw.close();
		} catch (IOException e) {
			System.out.println ( " Problème à l’écriture du fichier " ) ;
			System.exit(0);
		}
	}
	
	
	/**
	 * Permet de créer un fichier.txt qui stocke tout les matériels empruntés pour que le programme la garde en mémoire à chaque 	exécution
	 * @param path chemin relatif où l'on veut créer le fichier.txt
	 * @param listemprunt la liste des emprunt
	 */
	public void ecrireEmprunt(String path, ArrayList<Reservation> listemprunt) {

		try {
			FileWriter fw = new FileWriter(path);//+true qui écrase
			BufferedWriter bw = new BufferedWriter (fw);
			bw.newLine();
			PrintWriter pw = new PrintWriter(bw);
			//for si liste pas vide
			for (int i = 0; i < listemprunt.size(); i++) {
			//TODO : //	pw.print(listemprunt.get(i).getPrenom()+"\n"+listemprunt.get(i).getNom()+"\n"+listemprunt.get(i).getMateriel().getType()+"\n"+listemprunt.get(i).getMateriel().getId()+"\n"+listemprunt.get(i).getMateriel().getExemplaire()+"\n"+listemprunt.get(i).getDate()+"\n"+listemprunt.get(i).getDuree()+"\n");	
			}
			pw.close();
		} catch (IOException e) {
			System.out.println ( " Problème à l’écriture du fichier " ) ;
			System.exit(0);
		}
	}
	
	
	/**
	 * Permet de créer un fichier.txt qui stocke les matériels en réparations pour que le programme la garde en mémoire à chaque 	exécution
	 * @param path chemin relatif où l'on veut créer le fichier.txt 
	 * @param listreparation la liste des reparations
	 */
	public void ecrireReparation(String path, ArrayList<Repair> listreparation) {

		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.newLine();
			PrintWriter pw = new PrintWriter(bw);
			//for si liste pas vide
			for (int i = 0; i < listreparation.size(); i++) {
			//	pw.print(listreparation.get(i).getDate()+"\n"+listreparation.get(i).getDuree()+"\n"+listreparation.get(i).getMateriel().getType()+"\n"+listreparation.get(i).getMateriel().getId()+"\n"+listreparation.get(i).getMateriel().getExemplaire()+"\n");	
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("Problème à l’écriture du fichier");
			System.exit(0); 
		}
	}
	
	/**
	 * Permet de reconstruire la liste du materiel dans le stock
	 * @param path où se trouve le fichier.txt à lire
	 * @return une liste qui recupere les materiels stockes
	 */
	public ArrayList<Item> lireMateriel(String path) {
	
		ArrayList<Item> listmatos = new ArrayList<>();
	
		try{
			InputStream ips=new FileInputStream(path); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			int i = 0;
			String type="", id="";
			int nbreExemplaire=0, nbreExemplaireMax=0;
			while ((ligne = br.readLine())!=null ){
		
				if (i>0) {
					switch((i-1)%4){
						case 0 :
							type = ligne;
							break;
						case 1 :
							id = ligne;
							break;
						case 2 :
							try {
								nbreExemplaire = Integer.parseInt(ligne);
							} catch(NumberFormatException e){
								System.out.println(e.toString());
							}
							break;
						case 3 :
							try{
								nbreExemplaireMax = Integer.parseInt(ligne) ;
							} catch(NumberFormatException e){
								System.out.println(e.toString());
							}
							//TODO : //listmatos.add(new Materiel(type,nbreExemplaire,nbreExemplaireMax,id));
							break;
					}
				}
				i++;
			}
			br.close();		
		} catch (Exception e){
			System.out.println("Pas de stock en mémoire : création d'un stock vide");
		}

		return listmatos;
		
	}

	/**
	 * Permet de reconstruire la liste des materiel stockes
	 * @param path chemin relatif où se trouve le fichier.txt à lire
	 * @return une liste qui recupere les réparations stockees
	 */
	public ArrayList<Repair> lireReparation(String path){
	
		ArrayList<Repair> listreparation = new ArrayList<>();
	
		try{
			InputStream ips=new FileInputStream(path); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			int i = 0, duree = 0;
			String type="", id="", date = "";
			int nbreExemplaire=0;
			while ((ligne = br.readLine())!=null ){
		
				if (i>0) {
					switch((i-1)%5){
					case 0 :
						date = ligne; // jj/mm/annee
						break;
					case 1 :
						try{
						duree = Integer.parseInt(ligne) ;
						}
						catch(NumberFormatException e){
						System.out.println(e.toString());						
						}
						break;
					case 2 :
						type=ligne;
						break;
					case 3 :
						id = ligne;
						break;
					case 4 :
						try{
							nbreExemplaire = Integer.parseInt(ligne) ;
						}
						catch(NumberFormatException e){
							System.out.println(e.toString());						
						}
						//TODO : listreparation.add(new Reparation(new Materiel(type,nbreExemplaire,id), new DateJ(date), duree));
						break;
					}
		
			
				}
				i++;
			}
			br.close();
		} catch (Exception e){
			//System.out.println("Pas de réparation en mémoire.");
		}

		return listreparation;
		
	}
	
	/**
	 * Permet de recuperer la liste des emprunts stockés
	 * @param path chemin relatif où se trouve le fichier.txt à lire
	 * @return une liste qui contient les emprunts stockée par ecrireEmprunt
	 */
	public ArrayList<Reservation> lireEmprunt(String path){
	
		ArrayList<Reservation> listemprunt = new ArrayList<>();
	
		try{
			InputStream ips=new FileInputStream(path); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			int i = 0, duree = 0;
			String type="", id="", date="", nom="", prenom="";
			int nbreExemplaire=0;
			while ((ligne = br.readLine())!=null ){
		
				if (i>0) {
					switch((i-1)%7){
						case 0 :
							prenom=ligne;
							break;
						case 1 :
							nom = ligne;
							break;
						case 2 :
							type=ligne;
							break;
						case 3 :
							try{
								id = ligne;
							}
							catch(NumberFormatException e){
								System.out.println(e.toString());
							}
							break;
						case 4 :
							try{
								nbreExemplaire = Integer.parseInt(ligne) ;
							}
							catch(NumberFormatException e){
								System.out.println(e.toString());
							}
						case 5 :
							date = ligne;
							break;
						case 6 :
							try{
								duree = Integer.parseInt(ligne) ;
							}
							catch(NumberFormatException e){
								System.out.println(e.toString());						
							}
							//TODO : listemprunt.add(new Emprunt(nom , prenom, new Materiel(type,nbreExemplaire,id),new DateJ(date), duree));
							break;
					}

				}
			i++;
			}
			br.close();
		}		
		
		catch (Exception e){
			//System.out.println("Pas d'emprunt en mémoire.");
		}

		return listemprunt;
	}

	/**
	 * Permet d'ecrire clairement la liste des emprunts dans un but d'impression par le gérant par exemple
	 * @param path chemin relatif où se trouve le fichier.txt à lire
	 * @param listemprunt la liste des emprunts 
	 */
	public void ecrireEmpruntJoli(String path, ArrayList<Reservation> listemprunt) {

		try {
			FileWriter fw = new FileWriter(path);//+true qui écrase
			BufferedWriter bw = new BufferedWriter (fw);
			bw.newLine();
			PrintWriter pw = new PrintWriter(bw);
			
			//TODO :pw.print(s.toStringEmprunt());	
			
			pw.close();
		} catch (IOException e) {
			System.out.println ( " Problème à l’écriture du fichier " ) ;
			System.exit(0);
		}
	}				
	
	
}