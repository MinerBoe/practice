class Awesome {

	public static void main(String[] args) {

		int times = Integer.parseInt(args[0]);
		String message = "You're the best";
		int exclamation = 0;

		if (args.length > 1) {
			exclamation = Integer.parseInt(args[1]);
			for (int i = 0; i < exclamation; i++) {
				message += "!";
			} 
		}

		for (int i=0; i < times; i++) {

			System.out.println(message);
		}
	}
}