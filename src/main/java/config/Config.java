package projet.config;

import projet.supply.Camera;
import projet.supply.Headset;
import projet.supply.OS;
import projet.supply.Phone;
import projet.supply.Tablets;

/**
* This is the global class in order to test the application.
* @author user
*
*/
public class Config {

	public static final Phone GALAXY = new Phone(OS.ANDROID);
	public static final Phone IPHONE5 = new Phone(OS.IOS);
	public static final Phone IPHONE4 = new Phone(OS.IOS);
	public static final Tablets KINDLE = new Tablets(OS.ANDROID);
	public static final Tablets IPAD = new Tablets(OS.IOS);
	public static final Headset HP = new Headset();
	public static final Camera NIKON = new Camera();
	public static final Camera CANON = new Camera();
}
