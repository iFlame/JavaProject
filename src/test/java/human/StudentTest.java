package human;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stockpile.Stock;

public class StudentTest {

	private Student student;
	private Student student2;
	private Stock stock;

	@Before
	public void initialize() {
		stock = new Stock();
		student = new Student();
		student2 = new Student("test", stock);
	}

	@After
	public void clean() throws Exception {
		student = null;
		student2 = null;
		stock = null;
	}

	@Test
	public void construct() {
		assertNotNull(student);
		assertNotNull(student2);
	}

	@Test
	public void get() {
		assertEquals(1, Student.getBorrownumberMax());
		assertEquals(7, Student.getStudenttermborrowing());
	}

	@Test
	public void borrowerTest() {
		student.setTermBorrowing(7);
		assertEquals(7, student.getTermBorrowing());
		student.setId("coucou");
		assertEquals("coucou", student.getId());
		student.setBorrowNumber(3);
		assertEquals(3, student.getBorrowNumber());
		assertFalse(student.isTeacher());
	}

}
