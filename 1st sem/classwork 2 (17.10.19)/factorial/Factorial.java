public class Factorial {
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		System.out.println(calcFact(n));
		System.out.println(calcFact2(n));
	}
	public static long calcFact(long num) {
		if (num < 0) return -1;
 		if (num == 0) return 1; // условия выхода из рекурсии
		return num * calcFact(num-1);
	};

	public static long calcFact2(long num) {
		long f = 1;
		for (long i = num; i > 0; i--) {
			f = f * i;
		};
		return f;
	}
};
