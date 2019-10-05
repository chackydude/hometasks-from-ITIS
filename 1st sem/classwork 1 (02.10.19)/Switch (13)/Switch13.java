public class Switch13 {
	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		if (args.length == 2) {// k == 3 ; n == 5
			k = k - n; // k = 3 - 5 = -2
			n = k + n; // n = -2 + 5 = 3
			k = n - k;// k = 3 - (-2) = 5
			System.out.print("k" + "=" + k + "  " + "n" + "=" + n);
		} else {
			System.out.println("Enter only two arguments");
		}
	}
}