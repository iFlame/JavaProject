package supply;

/**
 * This class create an equipment with a type and an OS
 * 
 * @author user
 * 
 */
public abstract class Equipment {

	private Type type;
	private OS os;
	private int repairTime;
	private int maxRepair;

	/**
	 * Create a default Equipment without os and with a type at null
	 */
	public Equipment() {
		this.os = OS.NO_OS;
		this.type = null;
		this.repairTime = 0;
		this.maxRepair = 0;
	}

	/**
	 * @return the repairTime
	 */
	public int getRepairTime() {
		return repairTime;
	}

	/**
	 * @param repairTime the repairTime to set
	 */
	public void setRepairTime(int repairTime) {
		this.repairTime = repairTime;
	}

	/**
	 * 
	 * @return the type of the equipment
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Set the type of the equipment
	 * 
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * 
	 * @return the OS of the equipment
	 */
	public OS getOs() {
		return os;
	}

	/**
	 * Set the OS of the equipment
	 * 
	 * @param os
	 */
	public void setOs(OS os) {
		this.os = os;
	}

	public int getMaxRepair() {
		return maxRepair;
	}

	public void setMaxRepair(int maxRepair) {
		this.maxRepair = maxRepair;
	}

}
