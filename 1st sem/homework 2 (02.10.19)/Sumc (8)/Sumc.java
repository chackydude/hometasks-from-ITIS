public class Sumc {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double x = Double.parseDouble(args[1]);
		double s = 0.0;
		if (args.length == 1 && x>0.0 && n>0) {
			for (int i = 1; i <= n; i++) {
				s = x + Math.cos(s);
			}
			System.out.println(s);
		} else {
			System.out.println("Enter two positive arguments");
		}
	}
}