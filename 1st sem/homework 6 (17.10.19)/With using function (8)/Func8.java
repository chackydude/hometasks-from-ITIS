public class Func8 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double x = Double.parseDouble(args[1]);
		if (args.length == 2 && x>0.0 && n>0) {
			System.out.println(calculateRow(n, x));
		} else {
			System.out.println("Enter two positive arguments");
		}
	}
	public static double calculateRow(int n, double x){
		double s = 0.0;
		for (int i = 1; i <= n; i++) {
			s = x + Math.cos(s);
		};
		return s;
	};
}