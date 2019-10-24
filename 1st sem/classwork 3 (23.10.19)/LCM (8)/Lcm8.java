import java.util.Scanner;

public class Lcm8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		for (int i = 2; i < Math.min(number1, number2); i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				System.out.printf("\nLCM is - %d", i);
			};
		};
	}
}