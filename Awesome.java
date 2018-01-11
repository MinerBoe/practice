class Awesome {

	public static void main(String[] args) {
		int times = Integer.parseInt(args[0]);
		int exclamation = 0;
		if (args.length > 1) {
			exclamation = Integer.parseInt(args[1]);
		}

		String points = "";
		for (int i = 0; i < exclamation; i++) {
			points = points + "!";
		} 
		

		for (int i=0; i < times; i++) {

			System.out.println("You're the best" + points);
		}
	}
}