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

		//второй способ 
		// a * b = НОД(а,b) * НОК(a,b)
		// int inputValue1 = number1;
		// int inputValue2 = number2;

		// while (number1 != 0 && number2 != 0) {
		// 	if (number1 > number2) {
		// 		number1 = number1 % number2;
		// 	} else number2 = number2 % number1;
		// };

		// int result = inputValue1 * inputValue2 / (number1 + number2)

		System.out.print(number);
	}
}
