import java.util.Scanner;
public class Sequence3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		double x = input.nextDouble();
		double sum = 0;

		for (int i = 1; i < k*2; i = i + 2) {
			sum = sum + 1 / (Math.pow(x, i) - 3);
		};

		System.out.println(sum);
	}
}

/*
  (1)			(2)			 (3)...
1/x - 3   +   1/x^3 - 3  + 1/x^5 - 3  ...

*/