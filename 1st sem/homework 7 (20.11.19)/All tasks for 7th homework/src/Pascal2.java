import java.util.Scanner;

// TODO write method lengthOfNumber - to caclculate length of one number - member of the caching array
// TODO write method lengthOfLine - to caclculate length of the caching array

public class Pascal2 {
    public static void main(String[] args) {
        System.out.println("Enter height of Pascal's triangle:");
        Scanner inputScanner  = new Scanner(System.in);
        int height = inputScanner.nextInt();
        int[][] cache = new int[height][height];
        // fill our cache
        for (int i = 0; i < height; i++) {
                cache[i] = calcArray(i);
        };
        // length of the last line
        long maxLen = calcLen(height);
        // output
        for (int i = 0; i < height; i++) {
            for (int g = 0; g < Math.ceil((maxLen - calcLen(i))/2); g++) {
                System.out.print(' ');
            };
            for (int k = 0; k < cache[i].length; k++) {
                System.out.print(cache[i][k] + " ");
            }
            System.out.println();
        }
    }

    // method which creates array of the binomial coefficients, with using recursion
    public static int[] calcArray(int numberOfLine) {
        // numberOfLine - number of the line, equals quantity of the members in the line
        int[] resultArray = new int[numberOfLine + 1];
        for (int i = 1; i < numberOfLine; i++) {
            resultArray[i] = calcArray(numberOfLine-1)[i] + calcArray(numberOfLine-1)[i-1];
        }
        resultArray[0] = 1;
        resultArray[numberOfLine] = 1;
        return resultArray;
    }

    // method which calculates quantity of the digits in the number
    public static long lengthOfNumber(long number) {
        long countDigit = 0;
        while (number > 0) {
            number = number / 10;
            countDigit++;
        };
        return countDigit;
    }

    /* calculating quantity of the numbers in the string */
    public static long calcLen(long num) {
        // variable what
        long sumDigit = 0;
        for (long j = 0; j <= num; j++) {
            long number = calcFact(num) / (calcFact(j)*calcFact(num-j));
            sumDigit = sumDigit + lengthOfNumber(number);
        };
        /* quantity of the numbers and spases in the string */
        return sumDigit + num - 1;
    }

    /* calculating factorial */
    public static long calcFact(long num) {
        long f = 1;
        for (long i = num; i > 0; i--) {
            f = f * i;
        };
        return f;
    };
}
