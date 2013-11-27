package supply;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PhoneTest {

	private Phone phone;
	private Phone phone2;
	
	@Before
	public void initialize() {
		phone = new Phone(OS.NO_OS);
		phone2 = new Phone();
	}

	@After
	public void clean() throws Exception {
		phone = null;
	}
	
	@Test
	public void Construc() {
		assertNotNull(phone);
		assertNotNull(phone2);
	}
	
	@Test
	public void testAll() {
		assertEquals(OS.NO_OS,phone.getOs());
		assertEquals(Type.PHONE,phone.getType());
	}
}
