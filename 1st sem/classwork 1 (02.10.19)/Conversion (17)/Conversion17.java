public class Conversion17 {
	public static void main(String[] args) {
		if (args.length == 2) {
			int number = Integer.parseInt(args[0]);
			int basis = Integer.parseInt(args[1]);
			int sum = 0;
			StringBuffer binary = new StringBuffer("");
			while (number > 0) {
				binary.insert(0, number % basis);
				sum = sum + (number % basis);
				number = number / basis;
			};
			for (int i = 0; i <= binary.length() - 1; i++) {
					System.out.print(binary.charAt(i));
				}; 
			System.out.println("\nSum of digits: " + sum);

		} else {
			System.out.println("Enter two arguments");
		}
	}
}
