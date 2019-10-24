import java.util.Scanner;
public class Pascal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		int sumDigit = 0;
		//вычисляем количство цифр в последней строке, yevthfwbz cnhjr c 1
		for (int j = 0; j < height; j++) {
				int countDigit = 1; // не 0, а 1 т.к. учитываем пробел после числа
				double number = calcFact(height) / (calcFact(j)*calcFact(height-j)); 
				while (number > 1) {
					number = number / 10;
					countDigit++; // считаем количество цифр в каждом числе
				};
				sumDigit = sumDigit + countDigit;				
		};

		// sumDigit = sumDigit / 2;
		System.out.println(sumDigit);

		for (int i = 1; i <= height; i++) {
			for (int g = 1; g <= sumDigit - i; g++) {
				System.out.print(' ');
			};

			for (int j = 1; j <= i; j++) {
				System.out.print(calcFact(i) / (calcFact(j)*calcFact(i-j)));
				System.out.print(' ');
			};

			System.out.println();
		};
	};

	public static long calcFact(long num) {
		if (num < 0) return -1;
 		if (num == 0) return 1; 
		return num * calcFact(num-1);
	};
}



