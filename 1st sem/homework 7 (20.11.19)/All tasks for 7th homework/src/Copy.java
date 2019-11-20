import java.util.Arrays;
import java.util.Scanner;

public class Copy {
    public void startCopy() {
        System.out.println("Enter array's length");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array  = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Even array");
        if (copyArray(array).length == 0) {
            System.out.println("Empty");
        } else {
            System.out.println(Arrays.toString(copyArray(array)));
        }
    }

    public int[] copyArray(int[] array) {
        int copyLength = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            if (array[i] % 2 == 0) {
                copyLength++;
            }
        }
        int[] copy = new int[copyLength];
        int pos = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            if (array[i] % 2 == 0) {
                copy[pos]  = array[i];
                pos++;
            }
        }
        return copy;
    }
}
