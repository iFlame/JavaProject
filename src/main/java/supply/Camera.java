package supply;

/**
 * This class extends of Equipment and create a camera without OS
 * 
 * @author user
 * 
 */
public class Camera extends Equipment {

	/**
	 * Create a camera without OS but with a specific time before repair
	 */
	public Camera() {
		super();
		this.setType(Type.CAMERA);
	}
}
