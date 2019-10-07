public class Binary16 {
	public static void main(String[] args) {
		if (args.length == 1) {
			int number = Integer.parseInt(args[0]);
			int k = 0;
			StringBuffer binary = new StringBuffer("");
			while (number > 0) {
				binary.insert(0, number % 2);
				if (binary.charAt(0) == '1') {
					k++;
				};
				number = number / 2;
			};
			for (int i = 0; i <= binary.length() - 1; i++) {
					System.out.print(binary.charAt(i));
				}; 
			System.out.println("\nNumber of units: " + k);

		} else {
			System.out.println("Enter one argument");
		}
	}
}

