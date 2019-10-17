public class Func7 {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		if (args.length == 1) {
			System.out.println(calculateRow(n));
		} else  {
			System.out.println("Enter only one argument");
		}
	}
	public static double calculateRow(int n) {
		double s = 0;
		double f = -1;
		double b = 3;
		for (int i = 1; i <= n; i++) {
			s = s + f/(b*b);
			b = b + 2;
			f = f * f;
		};
		return s;
	};
}
