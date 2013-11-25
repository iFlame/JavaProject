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

	/**
	 * Create a default Equipment without os and with a type at null
	 */
	public Equipment() {
		this.os = OS.NO_OS;
		this.type = null;
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

}
