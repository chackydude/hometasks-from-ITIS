import java.util.Scanner;
public class Pascal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		int sumDigit = 0;
		//вычисляем количство цифр в последней строке, нумерация строк начинается с 0
		for (int j = 0; j < height; j++) {
				int countDigit = 0;
				double number = calcFact(height-1) / (calcFact(j)*calcFact(height-1-j)); 
				do {
					number = number / 10;
					countDigit++;
				} while (number > 9);
				sumDigit = sumDigit + countDigit;				
		};
		sumDigit = sumDigit + height; // учет пробелов после цифр
		// sumDigit = sumDigit / 2;
		System.out.println(sumDigit);

		for (int i = 0; i <= height; i++) {
			for (int g = 0; g < ((sumDigit)/2 - i - 1); g++) {
				System.out.print('*');
			};

			for (int j = 0; j <= i; j++) {
				System.out.print(calcFact(i) / (calcFact(j)*calcFact(i-j))); // печать числа в строке треугольника Паскаля
				System.out.print(' '); // пробел после числа
			};

			System.out.println(); //перевод на новую строку
		};
	};

	public static long calcFact(long num) {
		if (num < 0) return -1;
 		if (num == 0) return 1; 
		return num * calcFact(num-1);
	};
}

// TODO количсетво пробелов перед строкой - это разность количества символов 
// максимальной строки и итерируемой строки деленная на 2, т.е можно попробовать вычислять длину каждой строки