package supply;

/**
 * This Class extends from Equipment. This Class create a phone with a specific
 * OS or without OS with the default constructor
 * 
 * @author user
 * 
 */
public class Phone extends Equipment {

	/**
	 * Create a Phone with the specific OS
	 * 
	 * @param os
	 */
	public Phone(OS os) {
		super();
		this.setOs(os);
	}

	/**
	 * Create a phone without OS;
	 */
	public Phone() {
		this(OS.NO_OS);
	}
}
