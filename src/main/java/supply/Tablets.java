package supply;

/**
 * Create a Tablet with different type of OS and extend from the class
 * Equipment.
 * 
 * @author Guillaume borg & Quentin Cornevin
 * 
 */
public class Tablets extends Equipment {

	/**
	 * Create a default Tablets without OS.
	 */
	public Tablets() {
		this(OS.NO_OS);
		this.setMaxRepair(SupplyConstant.TABLETS_REPAIR_TIME);
		this.setType(Type.TABLETS);
	}

	/**
	 * Create a Tablet with an OS
	 * 
	 * @param osType
	 */
	public Tablets(OS osType) {
		super();
		this.setType(Type.TABLETS);
		this.setOs(osType);
		this.setMaxRepair(SupplyConstant.TABLETS_REPAIR_TIME);

	}

}
