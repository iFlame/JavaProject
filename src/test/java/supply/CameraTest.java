package supply;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CameraTest {

	private Camera camera;
	
	@Before
	public void initialize() {
		camera = new Camera();
	}
	
	@After
	public void clean() throws Exception {
		camera = null;
	}
	
	@Test
	public void all() {
		assertNotNull(camera);
	}

}
