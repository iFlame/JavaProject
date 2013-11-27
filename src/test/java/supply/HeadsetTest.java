package supply;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HeadsetTest {

	private Headset head;

	@Before
	public void initialize() {
		head = new Headset();
	}

	@After
	public void clean() throws Exception {
		head = null;
	}

	@Test
	public void test() {
		assertNotNull(head);
	}

}
