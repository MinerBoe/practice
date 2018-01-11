import java.util.Random;
import java.util.Scanner;

class Game {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int number = random.nextInt(1000) + 1;
		for (int i = 0; i < 3; i++) {
				System.out.println("Guess a number between 1 and 1000:");
				int guess = scanner.nextInt();
				checker(guess, number);
		}
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