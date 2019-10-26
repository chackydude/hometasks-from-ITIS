import java.util.Scanner;
public class Pascal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long height = input.nextInt();

		long maxLen = calcLen(height); // определяем длину наибольшей строки

		for (int i = 0; i < height; i++) {
			for (int g = 0; g < Math.ceil((maxLen - calcLen(i))/2); g++) {
				System.out.print(' ');
			};

			for (int j = 0; j <= i; j++) {
				System.out.print(calcFact(i) / (calcFact(j)*calcFact(i-j))); // печать числа в строке треугольника Паскаля
				System.out.print(' '); // пробел после числа
			};
			System.out.println(); //перевод на новую строку
		};

	};

	// вычисление факториала
	public static long calcFact(long num) {
		long f = 1;
		for (long i = num; i > 0; i--) {
			f = f * i;
		};
		return f;
	};
	// вычисление количсетва символов в строке
	public static long calcLen(long num) {
		long sumDigit = 0; // переменная хранящая текущую длину текущей строки (точлько чисел)
		for (long j = 0; j <= num; j++) {
		long countDigit = 0;// переменная хранящая количество цифр текущей строки
		long number = calcFact(num) / (calcFact(j)*calcFact(num-j)); 
		sumDigit = sumDigit + lengthOfNumber(number);
		};
		return sumDigit + num - 1; // кол-во символов в строке с учетом пробелов
	}
	//вычисление длины числа
	public static long lengthOfNumber(long number) {
		long countDigit = 0;
		while (number > 0) {
			number = number / 10;
			countDigit++;
		};
		return countDigit;
	}
}
