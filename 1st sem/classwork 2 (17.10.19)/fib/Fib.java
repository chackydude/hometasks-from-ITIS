public class Fib {
	public static void main(String[] args) {
		long n = Long.parseLong(args[0]);
		System.out.println(calcFib(n));
		System.out.println(calcFib2(n));
	}
	public static long calcFib(long num) {
		if (num < 0) return 0;
 		if (num == 1) return 1; 
		return calcFib(num - 2) + calcFib(num - 1);
	};

	public static long calcFib2(long num) {
		long fib_sum = 0;
		long fib1 = 1;
		long fib2 = 1;
		long i = 0;
		while (i < num - 2) {
			fib_sum = fib1 + fib2;
		    fib1 = fib2;
		    fib2 = fib_sum;
		    i = i + 1;
		}
		return fib_sum;
	} 
};

