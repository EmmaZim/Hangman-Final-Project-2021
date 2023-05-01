import java.util.Scanner;

/* The InputReader class will read the input from the user. 
 * @author Emma Zimmerman
 * @version December 12, 2021
 */
public class InputReader {

	/*
	 * The getuserInput method will take input from the user to use in the hangman
	 * game.
	 */
	public static String getUserInput() {
		Scanner scannerObj = new Scanner(System.in);
		return scannerObj.nextLine();
	}
}
