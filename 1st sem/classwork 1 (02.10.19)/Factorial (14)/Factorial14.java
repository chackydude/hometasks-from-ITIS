public class Factorial14 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (args.length == 1 && n > 0) {
			int result = 1;
			for (int i = 1; i<= n; i++) {
				result = result * i;
			};
			System.out.println(result);
		} else {
			System.out.println("Enter only one positive argument");
		}
	}
}