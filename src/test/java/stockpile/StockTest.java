package stockpile;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import supply.Equipment;
import supply.Tablets;

public class StockTest {
/*
	private Equipment equip1;
	private Equipment equip2;
	private List<Reservation> reservList1;
	private List<Reservation> reservList2;
	private Item item1;
	private Item item2;
	private List<Reservation> undoRes;
	private List<Item> itemList;
	private Stock stock;
	private Reservation reserv;
	private Calendar date1;
	private Calendar date2;
	
	
	@Before
	public void initialize() {
		equip1 = new Tablets();
		equip2 = new Tablets();
		reservList1 = new ArrayList<>();
		reservList2 = new ArrayList<>();
		reservList1.clear();
		reservList2.clear();
		item1 = new Item(equip1,reservList1);
		item2 = new Item(equip2, reservList2);
		itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);
		undoRes = new ArrayList<>();
		undoRes.clear();
//		stock = new Stock(itemList,undoRes);
		date1 = Calendar.getInstance();
		date2 = Calendar.getInstance();
		date2.add(Calendar.DAY_OF_MONTH, 1);
		
		reserv = new Reservation("caca",equip1,date1,date1);
	}
	

	@Test
	public void isAvailable() {
		assertTrue(stock.isAvailable(reserv));
	}
	
	
	/*
	@Test
	public void timeAvailable() {
		//assertTrue(stock.timeAvailable(item1,date1,date2));
	}
	*/
	
	
}
