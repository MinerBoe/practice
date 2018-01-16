import java.util.Random;
import java.util.Scanner;

class Game {

	public static void main(String[] args) {

		Random random = new Random(); // number in the parens gives the same random sequence everytime for debugging
		Scanner scanner = new Scanner(System.in);

		int number = random.nextInt(1000) + 1;
		int guesses = 0;

		System.out.println("Guess a number between 1 and 1000:");
		int guess = scanner.nextInt();
		checker(guess, number);

		while (guesses < 6 && guess != number) {

			guesses++;

			System.out.println("Guess a number between 1 and 1000:");
			guess = scanner.nextInt();
			checker(guess, number);

		}

		System.out.println("The number was: " + number);
	}

	public static void checker(int guess, int target) {

			if (guess == target) {
				System.out.println("You got the number right!");
			} else if (guess > target) {
				System.out.println("That guess was too big");
			} else {
				System.out.println("That guess was too small");
			}

	}
}