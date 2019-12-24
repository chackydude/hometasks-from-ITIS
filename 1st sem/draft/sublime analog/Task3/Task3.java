public class Task3 {
	public static void main(String[] args) {
		double x = Float.parseFloat(args[0]);
		double y = Float.parseFloat(args[1]);
		final double EPS = 1e-8;
		if (x == 5.0) {
			System.out.println("incorrect input");
		} else {
			if (Math.abs(y - (1 / x + 5)) <= EPS) {
				System.out.println("find solution");
			} else System.out.println("that's not a solution");
		}
	}
}