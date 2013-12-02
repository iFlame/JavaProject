package stockinterface;

import static org.junit.Assert.*;

import human.Teacher;
import human.User;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stockpile.Stock;

public class StructureTest {

	private Stock stock;
	private Stock stock2;
	private User teach;
	private User teach2;
	private Structure struc;
	private ArrayList<User> useLi;
	private ArrayList<User> useLi2;

	@Before
	public void initialize() {
		teach = new Teacher();
		teach2 = new Teacher();
		stock = new Stock();
		stock2 = new Stock();
		useLi = new ArrayList<>();
		useLi2 = new ArrayList<>();
		useLi.add(teach);
		useLi2.add(teach2);
		struc = new Structure(stock, useLi);
	}

	@After
	public void cleanse() throws Exception {
		stock = null;
		stock2 = null;
		teach2 = null;
		teach = null;
		struc = null;
		useLi = null;
	}

	@Test
	public void testConstruc() {
		assertNotNull(struc);
	}

	@Test
	public void getSetStock() {
		struc.setStock(stock2);
		assertEquals(stock2, struc.getStock());
	}

	@Test
	public void getSetList() {
		struc.setUserList(useLi2);
		assertEquals(useLi2, struc.getUserList());
	}
}
