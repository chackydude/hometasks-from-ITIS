import java.util.Arrays;
import java.util.Scanner;

// TODO написать метод lengtOfNumber - для вычисления длины числа
// TODO написать сетод lengthOfLine - для вычисления длины всей строки (массива)
// TODO реализовать логику вычисления элементов масива каждой строки
public class Pascal2 {
    public static void main(String[] args) {
        System.out.println("Enter height of Pascal's triangle:");
        Scanner inputScanner  = new Scanner(System.in);
        int height = inputScanner.nextInt();
        int width = height;
        int[] base = {1};
        int[][] cache = new int[height][height];
        for (int i = 0; i < height; i++) {
                cache[i] = calcArray(i);
        };
        for (int i = 0; i < height; i++) {
            System.out.println(Arrays.toString(cache[i]));
        }
    }

    // функция, создающая массив заполненный биноминальными коэфициентами
    public static int[] calcArray(int numberOfLine) {
        // numberOfLine - номер строки, равный количеству элементов в строке
        int[] resultArray = new int[numberOfLine + 1];
        for (int i = 1; i < numberOfLine; i++) {
            resultArray[i] = calcArray(numberOfLine-1)[i] + calcArray(numberOfLine-1)[i-1];
        }
        resultArray[0] = 1;
        resultArray[numberOfLine] = 1;
        return resultArray;
    }

    public static long lengthOfLine(long num) {
        // variable what
        long sumDigit = 0;
        for (long j = 0; j <= num; j++) {
            long number = 0;
            sumDigit = sumDigit + lengthOfNumber(number);
        };
        /* quantity of the numbers and spases in the string */
        return sumDigit + num - 1;
    }

    // calculate length of
    public static long lengthOfNumber(long number) {
        long countDigit = 0;
        while (number > 0) {
            number = number / 10;
            countDigit++;
        };
        return countDigit;
    }
}
