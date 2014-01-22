package supply;

/**
 * This class create a Laptop with specific parameter : a laptop have a specific
 * OS in the list defin in the enum OS and a specif repair time
 * 
 * @author user
 * 
 */

public class Laptop extends Equipment {

	/**
	 * Create a random laptop with windows as a default OS and a number of
	 * borrow before repair define in the interface SupplyConstant
	 */
	public Laptop() {
		super();
		this.setType(Type.LAPTOP);
		this.setOs(OS.WINDOWS);
		this.setMaxRepair(SupplyConstant.LAPTOP_REPAIR_TIME);

	}

}
