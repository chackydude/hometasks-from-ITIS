public class Sum {
	public static void main(String[] args) {
		double s = 1.0;
		int k = Integer.parseInt(args[0]);
		double x = Double.parseDouble(args[1]);
		double den = x/(k+1);
		if (args.length == 2 && k>0 && x>0.0) {
			for (int i = k; i > 1; i--) {
			    den = i + den;
				s = s + x/den;
			};
			System.out.println(s);
		} else {
			System.out.println("Enter two positive arguments");
	}
}