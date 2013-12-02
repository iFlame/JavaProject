package stockinterface;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import supply.Camera;
import supply.Equipment;
import supply.Headset;
import supply.OS;
import supply.Phone;
import supply.Tablets;

public class Pattern {

	private Structure structure;
	private Imput imput;
	private Display display;

	/**
	 * Create the interface with the user
	 * 
	 * @param struc
	 */
	public Pattern(Structure struc) {
		this.structure = struc;
		this.imput = new Imput();
		this.display = new Display();
	}

	/**
	 * Run the menu
	 */
	public void run() {
		Command command;
		do {
			display.welcome();
			menu1();
			command = imput.getCommand();
		} while (!(command.equals(Command.QUIT)));
		display.close();
	}

	/**
	 * Run the first menu.
	 */
	private void menu1() {
		int wrong;
		int answer;
		do {
			display.menu1();
			answer = imput.getInt();
			wrong = choice2(answer);
		} while (wrong == 3);
	}

	/**
	 * Method who make the difference for the two choice of menu1
	 * 
	 * @param imp
	 * @return
	 */
	private int choice2(int imp) {
		if (imp == 1) {
			menu21();
			return 1;
		} else if (imp == 2) {
			menu22();
			return 1;
		}
		return 3;
	}

	/**
	 * Display the menu of the default demo
	 * 
	 */
	public void menu21() {
		int answer;
		while (true) {
			display.menu21();
			answer = imput.getInt();
			choice3(answer);
		}
	}

	public void menu22() {
		// TODO : Si jamais tu recréer tout sans passer par la démo.
	}

	public void choice3(int answer) {
		if (answer == 1) {
			menu31();
		} else if (answer == 2) {
			menu32();
		} else if (answer == 3) {
			menu33();
		}

	}

	/**
	 * {@link} stockinterface.Display.menu31 Handle the interface if the user
	 * decide to log as a teacher.
	 */
	private void menu31() {
		int answer1;
		int answer2;
		display.menu31();
		answer1 = imput.getInt();
		print(Constant.QUESTION32);
		answer2 = imput.getInt();
		switch (answer1) {
		case 1:
			Equipment equip = new Tablets();
			if (structure.getStock().getEquipmentNumber(equip, answer2)) {
				// TODO : print si y assez de stuff
			}
			// TODO : print si y a pas assez de stuff
			break;
		case 2:
			Equipment equip2 = new Phone();
			if (structure.getStock().getEquipmentNumber(equip2, answer2)) {
				// TODO : print si y assez de stuff
			}
			// TODO : print si y a pas assez de stuff
			break;
		case 3:
			Equipment equip3 = new Headset();
			if (structure.getStock().getEquipmentNumber(equip3, answer2)) {
				// TODO : print si y assez de stuff
			}
			// TODO : print si y a pas assez de stuff
			break;
		case 4:
			Equipment equip4 = new Camera();
			if (structure.getStock().getEquipmentNumber(equip4, answer2)) {
				// TODO : print si y assez de stuff
			}
			// TODO : print si y a pas assez de stuff
			break;
		}
	}

	private void menu32() {
		// TODO Si l'utilisateur se connecte en tant qu'eleve
	}

	private void menu33() {
		// TODO Si l'utilisateur print la liste des utilisateurs
	}

	/**
	 * Print the message with a buffer
	 * 
	 * @param message
	 */
	public void print(String message) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(java.io.FileDescriptor.out), "ASCII"),
					Constant.BUFFER_SIZE);
		} catch (UnsupportedEncodingException e) {
			throw new AssertionError(e);
		}
		try {
			out.write(message);
			out.flush();
		} catch (IOException e) {
			throw new AssertionError(e);
		}
	}

}
