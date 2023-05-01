/**
 * This is to test the hangmanGame class. The game will print the welcome, set
 * up the game, play the game, and print the results. It is in a do-while loop
 * so the user can say if they want to play the game again. If they are finished
 * the game then goodbye will be printed.
 * 
 * @author Emma Zimmerman
 * @version December 13, 2021
 *
 */
public class Driver {
	public static void main(String[] args) {
		hangmanGame game1 = new hangmanGame();
		InputReader reader = new InputReader();
		do {
			game1.welcome();
			game1.setupGame();
			game1.startGame();
			game1.printResultOfGame();
			System.out.println("Do you want to play again (yes or no)? ");
		} while (reader.getUserInput().equalsIgnoreCase("yes"));
		System.out.println("Goodbye!");
	}
}
