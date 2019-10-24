import java.util.Scanner;
public class Dividers7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		for (int i = 1; i <= Math.ceil(Math.sqrt(number)) + 1; i++) {
			if (number % i == 0) {
				System.out.print(i);
				System.out.print(' ');
			};
		};
		if (number % 2 == 0) {
			System.out.print(number / 2);
			System.out.print(' ');
		};

		System.out.print(number);
	}
}
