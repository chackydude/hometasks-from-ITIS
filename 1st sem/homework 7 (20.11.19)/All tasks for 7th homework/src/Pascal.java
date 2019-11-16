import java.util.Scanner;
public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height of Pascal's triangle:");
        long height = input.nextInt();

        /* length of the max array */
        long maxLen = calcLen(height);

        for (int i = 0; i < height; i++) {
            for (int g = 0; g < Math.ceil((maxLen - calcLen(i))/2); g++) {
                System.out.print(' ');
            };
            /* initialization of the max array with length which equals to the number of the Pascal's triangle string */
            int[] array = new int[i+1];
            for (int j = 0; j <= i; j++) {
                array[j] = (int) (calcFact(i) / (calcFact(j)*calcFact(i-j)));
                /* print number of iterable string */
                System.out.print(array[j]);
                /* gap between two numbers */
                System.out.print(' ');
            };
            /* go to thw new string */
            System.out.println();
        };

    };

    /* calculating factorial */
    public static long calcFact(long num) {
        long f = 1;
        for (long i = num; i > 0; i--) {
            f = f * i;
        };
        return f;
    };
    /* calculating quantity of the number in the string */
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
    /*calculate length of the number*/
    public static long lengthOfNumber(long number) {
        long countDigit = 0;
        while (number > 0) {
            number = number / 10;
            countDigit++;
        };
        return countDigit;
    }
}
