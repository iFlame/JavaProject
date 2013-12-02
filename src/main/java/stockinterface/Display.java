package stockinterface;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Display {

	public Display() {
		super();
	}

	/**
	 * Print the home menu
	 */
	public void welcome() {
		print(Constant.WELCOME);
		print(Constant.NEWLINE);
	}

	/**
	 * Print the menu of close
	 */
	public void close() {
		print(Constant.CLOSE);
	}

	/**
	 * Print the first menu who propose to chose between default demo or insert
	 * his own value.
	 */
	public void menu1() {
		print(Constant.MENU1);
		print(Constant.NEWLINE);
		print(Constant.NEWLINE);
		print(Constant.CHOICE1);
		print(Constant.NEWLINE);
		print(Constant.CHOICE2);
		print(Constant.NEWLINE);
	}

	/**
	 * Print the menu if you chose the default demo. The menu propose to log as
	 * a teacher or as student or to print the list of user
	 */
	public void menu21() {
		print(Constant.MENU2);
		print(Constant.NEWLINE);
		print(Constant.CHOICE21);
		print(Constant.NEWLINE);
		print(Constant.CHOICE22);
		print(Constant.NEWLINE);
		print(Constant.CHOICE23);
		print(Constant.NEWLINE);
	}

	/**
	 * Print the teacher menu, he proposed to chose between all the different
	 * equipment and how many of them you want.
	 */
	public void menu31() {
		print(Constant.MENU3);
		print(Constant.NEWLINE);
		print(Constant.QUESTION31);
		print(Constant.NEWLINE);
		print(Constant.ANSWER31);
		print(Constant.NEWLINE);
		print(Constant.ANSWER32);
		print(Constant.NEWLINE);
		print(Constant.ANSWER33);
		print(Constant.NEWLINE);
		print(Constant.ANSWER34);
		print(Constant.NEWLINE);
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
