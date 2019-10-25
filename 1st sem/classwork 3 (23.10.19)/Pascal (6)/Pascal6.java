import java.util.Scanner;
public class Pascal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();

		int maxLen = calcLen(height); // определяем длину наибольшей строки

		for (int i = 0; i <= height; i++) {
			for (int g = 0; g < (maxLen - calcLen(g))/2; g++) {
				System.out.print(calcLen(g));
				System.out.print('*');
			};

			for (int j = 0; j <= i; j++) {
				System.out.print(calcFact(i) / (calcFact(j)*calcFact(i-j))); // печать числа в строке треугольника Паскаля
				System.out.print(' '); // пробел после числа
			};

			System.out.println(); //перевод на новую строку
		};
	};

	// вычисление факториаоа
	public static int calcFact(int num) {
		if (num < 0) return -1;
 		if (num == 0) return 1; 
		return num * calcFact(num-1);
	};
	// вычисление количсетва символов в строке
	public static int calcLen(int num) {
		int sumDigit = 0;
		for (int j = 0; j < num; j++) {
		int countDigit = 0;
		double number = calcFact(num-1) / (calcFact(j)*calcFact(num-1-j)); 
				do {
					number = number / 10;
					countDigit++;
				} while (number > 9);
				sumDigit = sumDigit + countDigit;
		};
		return sumDigit;
	}
}

// TODO количсетво пробелов перед строкой - это разность количества символов 
// максимальной строки и итерируемой строки деленная на 2, т.е можно попробовать вычислять длину каждой строки