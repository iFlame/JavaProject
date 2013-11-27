package human;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stockpile.Item;
import stockpile.Reservation;
import stockpile.Stock;
import supply.Equipment;
import supply.Tablets;
import human.Borrower;


public class StockAdminTest {
	
	private StockAdministrator stockAdmin;
	private StockAdministrator stockAdmin2;
	private Reservation reserv;
	private Reservation reserv2;

	private Stock stock;
	private Equipment equip;
	private Item item;
	private ArrayList<Reservation> reservList;
	private ArrayList<Item> itemList;
	private Calendar date1;
	private Calendar date2;
	
	@Before
	public void initialize() throws Exception {
		equip = new Tablets();
		date1 = Calendar.getInstance();
		reserv = new Reservation("test",equip,date1,date2);
		reserv2 = new Reservation();
		stockAdmin = new StockAdministrator();
		stockAdmin2 = new StockAdministrator(stock);
		equip = new Tablets();
		reservList = new ArrayList<>();
		reservList.add(reserv);
		item = new Item(equip,reservList);
		itemList = new ArrayList<>();
		itemList.add(item);
		stock = new Stock(itemList,null);
	}
	
	@After
	public void clean() throws Exception {
		stock = null;
		stockAdmin = null;
		stockAdmin2 = null;
		reserv = null;
		reserv2 = null;
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(stockAdmin);
		assertNotNull(stockAdmin2);
	}
	
	//TODO : Fair les 2 test
	
	/*
	@Test
	public void testValidation() {
		assertFalse(stockAdmin2.validation(reserv2));
	}

	@Test
	public void testValidation2() {
		assertTrue(stockAdmin2.validation(reserv));		
	}
	**/
	@Test
	public void testIsStockAdmin() {
		assertTrue(stockAdmin.isStockAdmin());
	}
	
	@Test
	public void testSetStock() {
		stockAdmin.setStock(stock);
		assertEquals(stock,stockAdmin.getStock());
	}
}