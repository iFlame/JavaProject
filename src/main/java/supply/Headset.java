package supply;

/**
 * This class extend of Equipment and create an headset without OS
 * 
 * @author user
 * 
 */
public class Headset extends Equipment {

	/**
	 * Create a default headset without OS.
	 */
	public Headset() {
		super();
		this.setType(Type.HEADSET);
	}
}
