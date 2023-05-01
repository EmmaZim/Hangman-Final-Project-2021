/**
 * The hangmanGame class will allow someone to play a game of hangman. The game
 * is set up and the player is asked to guess a letter. They have five guesses
 * and they will go down as there are incorrect guesses. IF the user runs out of
 * guesses then they lose. Once they are out of guesses the answer is printed.
 * If the player does not run out of guesses then they win.
 * 
 * @version December 16, 2021
 * @author Emma Zimmerman
 *
 */

public class hangmanGame {
	private String[] words = new String[] { "england", "japan", "italy", "germany", "hawaii", "flordia", "utah",
			"california", "arizona", "montana", "maine" };
	private String randomWord;
	private char[] letters;
	private int amountOfGuesses;
	InputReader input = new InputReader();

	/**
	 * A random word is created for the user to guess. Letters is assigned. The
	 * amount of guesses is assigned to the integer 5. This sets up the spaces for
	 * the word that is going to be guessed by the user.
	 */
	public void setupGame() {
		randomWord = words[(int) (Math.random() * words.length)];
		letters = new char[randomWord.length()];
		amountOfGuesses = 5;

		for (int i = 0; i < letters.length; i++) {
			letters[i] = '_';
		}
	}

	/**
	 * This will print welcome message and the category to the player when each game
	 * starts.
	 */
	public void welcome() {
		System.out.println("Begin Playing Hangman Game! The category is places you can visit. - By Emma Zimmerman");
	}

	/**
	 * This is the method to play the game. If the amount of guesses is greater than
	 * 0 and if the game is not over yet then the game begins. The lives remaining
	 * is printed each time a guess is correct or incorrect.If they guess correctly
	 * it stays the same. If it is guessed incorrectly then they will lose a guess
	 * each time.
	 * 
	 */
	public void startGame() {
		while (amountOfGuesses > 0 && isGameOver() == false) {
			System.out.println(" \n Lives Remaining: " + amountOfGuesses + " \n Guess A Letter: ");
			char letter = InputReader.getUserInput().charAt(0);

			boolean guess = false;

			for (int i = 0; i < randomWord.length(); i++) {
				char letter1 = randomWord.charAt(i);
				if (letter1 == letter) {
					letters[i] = letter1;
					guess = true;
				}
			}

			if (!guess) {
				amountOfGuesses--;
			}
		}
	}

	/**
	 * This will print the spaces with the word that is being guessed. Then if the
	 * letters are guessed within 5 tries the player wins. If the guesses run out
	 * then the player loses and the word they should have guessed will be printed.
	 */
	public void printResultOfGame() {
		System.out.println("\n Word to Guess: ");

		boolean endOfGame = isGameOver();
		if (endOfGame) {
			System.out.println(" \n You won! ");
		}
		if (amountOfGuesses == 0) {
			System.out.println(" You are out of Guesses! \n The word was: " + randomWord);
		}
	}

	/**
	 * This will use a boolean to determine if the game is over or not. Then it will
	 * return true or false depending on if the game is done.
	 * 
	 * @return endofGame
	 */
	public boolean isGameOver() {
		boolean endOfGame = true;
		for (char letter2 : letters) {
			if (letter2 == '_') {
				endOfGame = false;
			}
			System.out.print(" " + letter2);
		}
		return endOfGame;
	}
}
