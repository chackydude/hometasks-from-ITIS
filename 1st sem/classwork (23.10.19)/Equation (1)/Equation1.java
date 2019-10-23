public class Equation1 {
	public static void main(String[] args) {
	if (args.length == 3) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			double x1;
			double x2;
			
			double D = b*b - 4*a*c;

			if (D == 0.0) {
				x1 = (-1)*b/(2*a); 
				System.out.println("1 solution: " + x1);
			} else if (D > 0.0) {
				x1 = ((-1)*b + Math.sqrt(D))/(2*a);
				x2 = ((-1)*b - Math.sqrt(D))/(2*a);
				System.out.println("2 solutions: " + x1 + " " + x2);
			} else if (D < 0.0) {
				System.out.println("no solutions");
			};
		} else {
			System.out.println("enter 3 arguments");
		}
	}
}