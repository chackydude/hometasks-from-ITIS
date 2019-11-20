import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public void startReverse() {
        System.out.println("Enter array's length");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array  = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Default array");
        System.out.println(Arrays.toString(array));

        System.out.println("Reversed array");
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public int[] reverseArray(int[] array) {
        int[] reversed = Arrays.copyOf(array, array.length);
        int buffer;
        for (int i = 0; i < array.length/2; i++) {
            buffer = reversed[i];
            reversed[i] = reversed[reversed.length - i - 1];
            reversed[reversed.length - i - 1] = buffer;
        }
        return reversed;
    }
}
