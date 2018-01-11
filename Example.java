import java.util.Scanner;
import java.util.Random;

class Example {

	public static void main(String[] args) {
		// for (String str : args) {
		// 	System.out.println(str);

		// }

		// int n = Integer.parseInt(args[0]);
		// double a = Double.parseDouble(args[1]);
		// System.out.println(a / 2);

		// Scanner scanner = new Scanner(System.in);

		// System.out.println("Type two numbers: ");
		// int x = scanner.nextInt();
		// double z = scanner.nextDouble();
		// String s = scanner.next();

		// System.out.println("You typed " + x);
		// System.out.println("You typed " + z);

		Random random = new Random();

		for (int i=0; i< 100; i++) {
			int r  = random.nextInt(51) + 50;
			System.out.println(r);
		}

		

	}

}