public class Sumk {
	public static void main(String[] args) {
			int n = Integer.parseInt(args[0]);
			double s = 0.0;
			double result1 = 1.0, result2 = result1;
			if (args.length == 1) {
			for (int m = 1; m <= n; m++) {
				for (int j = 1; j <= (m-1); j++) {
					result1 = result1 * j;
				};
				for (int k = 1; k <= m*2; k++) {
					result2 = result2 * k;
				};
				s = s + result1*result1/result2;
				result1 = 1.0;
				result2 = 1.0;
			};
			System.out.println(s);
		}  else {
			System.out.println("Enter only one argument");
		}
	}
}


// 2nd variant with function factorial() (simplier):

// public class Sumk {
// 	static int factorial(int k) {
// 			int result = 1;
// 			for (int i = 1; i <= k; i++) {
// 				result = result * i;
// 			};
// 			return result;
// 	}
// 	public static void main(String[] args) {
// 			int n = Integer.parseInt(args[0]);
// 			double s = 0.0;
// 			if (args.length == 1) {
// 			for (int m = 1; m <= n; m++) {
// 				s = s + factorial(m-1)*factorial(m-1)/factorial(2*m);
// 			};
// 			System.out.println(s);
// 		} else System.out.println("Enter only one argument");
// 	}
// }
