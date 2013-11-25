package supply;

/**
 * Create a Tablet with different type of OS and extend from the class
 * Equipment.
 * 
 * @author user
 * 
 */
public class Tablets extends Equipment {

	/**
	 * Create a default Tablets without OS.
	 */
	public Tablets() {
		this(OS.NO_OS);
	}

	/**
	 * Create a Tablet with an OS
	 * 
	 * @param osType
	 */
	public Tablets(OS osType) {
		super();
		this.setType("Tablets");
		this.setOs(osType);
	}

}
